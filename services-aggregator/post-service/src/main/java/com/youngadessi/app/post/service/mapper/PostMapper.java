package com.youngadessi.app.post.service.mapper;

import com.youngadessi.app.post.service.dto.PostDto;
import com.youngadessi.app.post.service.entity.PostEntity;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface PostMapper {
    PostEntity DtoToEntity(PostDto post);

    PostDto EntityToDto(PostEntity dto);

    List<PostDto> EntityListToDtoList(List<PostEntity> postList);

    List<PostEntity> DtoListToEntityList(List<PostDto> postList);
}
