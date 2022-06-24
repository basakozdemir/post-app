package com.youngadessi.app.post.service.mapper;

import com.youngadessi.app.post.service.model.dto.PostCreateDTO;
import com.youngadessi.app.post.service.model.dto.TagDTO;
import com.youngadessi.app.post.service.model.entity.Post;
import com.youngadessi.app.post.service.model.entity.Tag;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.core.convert.converter.Converter;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PostMapper extends Converter<Post, PostCreateDTO> {
    @Mappings({
            @Mapping(target="tags", source = "tagDTOS")})
    Post postDto2PostEntity(PostCreateDTO postCreateDto);

    @Mappings({
            @Mapping(target="tagName", source = "tagName")})
    List<Tag> tagDto2TagEntity(List<TagDTO> tagCreateDTO);

    @Mappings({
            @Mapping(target="tagDTOS", source = "tags")})
    PostCreateDTO postEntity2PostDto(Post post);
}


