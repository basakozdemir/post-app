package com.youngadessi.app.post.service.api;

import com.youngadessi.app.post.service.model.dto.CommentDTO;
import com.youngadessi.app.post.service.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping
    public ResponseEntity<String> createComment(@RequestBody CommentDTO commentDTO){
        commentService.createComment(commentDTO);
        return new ResponseEntity<>("Comment created successfully", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCommentById(@PathVariable Long id){
        if(commentService.deleteComment(id)){
            return new ResponseEntity<>("Comment deleted succesfully", HttpStatus.OK);
    }
        else return new ResponseEntity<>("The comment with id=" + id + " is not exist.", HttpStatus.OK);
    }
}
