package com.youngadessi.app.post.service.service;

import com.youngadessi.app.post.service.mapper.CommentMapper;
import com.youngadessi.app.post.service.model.dto.CommentDTO;
import com.youngadessi.app.post.service.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    private static final CommentMapper COMMENT_MAPPER = Mappers.getMapper(CommentMapper.class);

    public void createComment(CommentDTO commentDTO){
        commentRepository.save(COMMENT_MAPPER.commentDto2Comment(commentDTO));
    }

    public Boolean deleteComment(Long postId){
        if(commentRepository.existsById(postId)){
            commentRepository.deleteById(postId);
            return true;
        }
        else return false;
    }

}
