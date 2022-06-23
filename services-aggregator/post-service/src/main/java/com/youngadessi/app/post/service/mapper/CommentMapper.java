package com.youngadessi.app.post.service.mapper;

import com.youngadessi.app.post.service.model.dto.CommentCreateDTO;
import com.youngadessi.app.post.service.model.entity.Comment;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface CommentMapper {
    Comment commentDto2CommentEntity(CommentCreateDTO commentCreateDto);
    CommentCreateDTO commentEntity2CommentDto(Comment comment);
}
