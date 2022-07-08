package com.youngadessi.app.post.service.mapper;

import com.youngadessi.app.post.service.model.dto.CommentDTO;
import com.youngadessi.app.post.service.model.entity.Comment;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    CommentDTO comment2CommentDto(Comment comment);
    Comment commentDto2Comment(CommentDTO commentDTO);
    List<Comment> commentDtoList2CommentList(List<CommentDTO> commentDTOList);
    List<CommentDTO> commentList2CommentDtoList(List<Comment> commentList);
}
