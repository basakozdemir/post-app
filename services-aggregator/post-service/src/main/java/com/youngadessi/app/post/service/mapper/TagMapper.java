package com.youngadessi.app.post.service.mapper;

import com.youngadessi.app.post.service.dto.PostDto;
import com.youngadessi.app.post.service.dto.TagDto;
import com.youngadessi.app.post.service.entity.Tag;
import org.mapstruct.Mapper;

@Mapper
public interface TagMapper {

    Tag tagDto2TagEntity(TagDto tagDto);
    PostDto tagEntity2TagDto(Tag tag);
}
