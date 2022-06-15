package com.youngadessi.app.post.service.mapper;

import com.youngadessi.app.post.service.dto.CommentDto;
import com.youngadessi.app.post.service.entity.Comment;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface CommentMapper {
    Comment commentDto2CommentEntity(CommentDto commentDto);
    CommentDto commentEntity2CommentDto(Comment comment);
}
