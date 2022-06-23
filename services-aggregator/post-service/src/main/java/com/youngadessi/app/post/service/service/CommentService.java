package com.youngadessi.app.post.service.service;

import com.youngadessi.app.post.service.model.dto.CommentCreateDTO;
import com.youngadessi.app.post.service.model.entity.Comment;
import com.youngadessi.app.post.service.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    public void createComment(CommentCreateDTO commentCreateDTO){
        Comment comment = new Comment();
        comment.setCommentText(commentCreateDTO.getCommentText());
        //comment.setPost(commentCreateDTO.getPost());
        commentRepository.save(comment);
    }


}
