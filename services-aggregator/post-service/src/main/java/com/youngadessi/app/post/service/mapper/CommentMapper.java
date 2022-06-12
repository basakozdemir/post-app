package com.youngadessi.app.post.service.mapper;

import com.youngadessi.app.post.service.dto.CommentDto;
import com.youngadessi.app.post.service.entity.CommentEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {

    CommentEntity DtoToEntity(CommentDto post);

    CommentDto EntityToDto(CommentEntity dto);

    List<CommentDto> EntityListToDtoList(List<CommentEntity> postList);

    List<CommentEntity> DtoListToEntityList(List<CommentDto> postList);

}
