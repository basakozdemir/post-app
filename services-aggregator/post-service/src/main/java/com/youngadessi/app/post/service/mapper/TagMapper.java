package com.youngadessi.app.post.service.mapper;

import com.youngadessi.app.post.service.model.dto.TagDTO;
import com.youngadessi.app.post.service.model.entity.Tag;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TagMapper {

    Tag tagDto2TagEntity(TagDTO tagCreateDTO);

    TagDTO tagEntity2TagDto(Tag tag);
}
