package com.youngadessi.app.post.service.api;

import com.youngadessi.app.post.service.model.dto.CommentCreateDTO;
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
    public ResponseEntity<String> createUser(@RequestBody CommentCreateDTO commentCreateDTO){
        commentService.createComment(commentCreateDTO);
        return new ResponseEntity<>("User created successfuly", HttpStatus.OK);
    }
}
