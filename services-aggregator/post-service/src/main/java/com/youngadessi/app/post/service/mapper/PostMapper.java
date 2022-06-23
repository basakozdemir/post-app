package com.youngadessi.app.post.service.mapper;

import com.youngadessi.app.post.service.model.dto.PostCreateDTO;
import com.youngadessi.app.post.service.model.entity.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.core.convert.converter.Converter;

@Mapper(componentModel = "spring")
public interface PostMapper extends Converter<Post, PostCreateDTO> {
    @Mappings({
            @Mapping(target="tags", source = "tagCreateDTOS")})
    Post postDto2PostEntity(PostCreateDTO postCreateDto);

    @Mappings({
            @Mapping(target="tagCreateDTOS", source = "tags")})
    PostCreateDTO postEntity2PostDto(Post post);
}


