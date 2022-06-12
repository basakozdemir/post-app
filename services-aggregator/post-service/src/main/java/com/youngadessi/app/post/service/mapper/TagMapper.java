package com.youngadessi.app.post.service.mapper;

import com.youngadessi.app.post.service.dto.TagDto;
import com.youngadessi.app.post.service.entity.TagEntity;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface TagMapper {

    TagEntity DtoToEntity(TagDto post);

    TagDto EntityToDto(TagEntity dto);

    List<TagDto> EntityListToDtoList(List<TagEntity> postList);

    List<TagEntity> DtoListToEntityList(List<TagDto> postList);
}
