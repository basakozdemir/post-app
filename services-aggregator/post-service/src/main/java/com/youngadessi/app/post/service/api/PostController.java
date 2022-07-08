package com.youngadessi.app.post.service.api;

import com.youngadessi.app.post.service.model.dto.PostCreateDTO;
import com.youngadessi.app.post.service.model.dto.PostReadDTO;
import com.youngadessi.app.post.service.model.dto.PostUpdateDTO;
import com.youngadessi.app.post.service.service.PostService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @Tag(name = "v1 - CMS Post API", description = "Maintain CMS Post API")
    @Operation(
            summary = "Upsert Post Language",
            description = "Upsert Post Language"
    )
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "OK.",
                            content = @Content(schema = @Schema(implementation = Void.class))),
                    @ApiResponse(
                            responseCode = "400",
                            description = "Bad Request."),
                    @ApiResponse(
                            responseCode = "401",
                            description = "Unauthorized."),
                    @ApiResponse(
                            responseCode = "403",
                            description = "Forbidden."),
                    @ApiResponse(
                            responseCode = "412",
                            description = "Precondition failed."),
                    @ApiResponse(
                            responseCode = "500",
                            description = "Internal server error.",
                            content = @Content(schema = @Schema(implementation = Void.class)))
            }
    )

    @PostMapping
    public ResponseEntity<String> createPost(@RequestBody PostCreateDTO postCreateDTO){
        postService.createPost(postCreateDTO);
        return new ResponseEntity<>("Post created succesfully", HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable Long id){
        Boolean deleted = postService.deletePost(id);
        if(deleted) {
            return new ResponseEntity<>("Post deleted succesfully", HttpStatus.OK);
        }
        else return new ResponseEntity<>("The post with id=" + id + " is not exist.", HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updatePost(@PathVariable Long id, @RequestBody PostUpdateDTO postUpdateDTO){
        postService.updatePost(id, postUpdateDTO);
        return new ResponseEntity<>("Post updated succesfully", HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<PostReadDTO> readPost(@PathVariable Long id){
        PostReadDTO postReadDTO = postService.searchById(id);
        return new ResponseEntity<>(postReadDTO, HttpStatus.OK);
    }
    @GetMapping
    public  ResponseEntity<List<PostReadDTO>> searchPost(@RequestParam String title){
        List<PostReadDTO> postReadDTOS = postService.searchByTitle(title);
        return new ResponseEntity<>(postReadDTOS, HttpStatus.OK);
    }


}
