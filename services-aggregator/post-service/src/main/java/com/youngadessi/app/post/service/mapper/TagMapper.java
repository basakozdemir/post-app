package com.youngadessi.app.post.service.mapper;

import com.youngadessi.app.post.service.model.dto.PostCreateDTO;
import com.youngadessi.app.post.service.model.dto.TagCreateDTO;
import com.youngadessi.app.post.service.model.entity.Tag;
import org.mapstruct.Mapper;

@Mapper
public interface TagMapper {

    Tag tagDto2TagEntity(TagCreateDTO tagCreateDto);
    PostCreateDTO tagEntity2TagDto(Tag tag);
}
