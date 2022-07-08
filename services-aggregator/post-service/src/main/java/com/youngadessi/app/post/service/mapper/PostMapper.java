package com.youngadessi.app.post.service.mapper;

import com.youngadessi.app.post.service.model.dto.PostCreateDTO;
import com.youngadessi.app.post.service.model.dto.PostReadDTO;
import com.youngadessi.app.post.service.model.dto.PostUpdateDTO;
import com.youngadessi.app.post.service.model.entity.Post;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.core.convert.converter.Converter;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PostMapper extends Converter<Post, PostCreateDTO> {
    @Mappings({
            @Mapping(target="tags", source = "tagDTOS")})
    Post postCreateDto2PostEntity(PostCreateDTO postCreateDto);

    @Mappings({
            @Mapping(target="tags", source = "tagDTOS")})
    Post postUpdateDto2PostEntity(PostUpdateDTO postUpdateDTO);
    @Mappings({
            @Mapping(target="tagDTOS", source = "tags")})
    PostCreateDTO postEntity2PostCreateDto(Post post);

    @Mappings({
            @Mapping(target="tagDTOS", source = "tags")})
    PostUpdateDTO postEntity2PostUpdateDto(Post post);

    @Mappings({
            @Mapping(target="tagDTOS", source = "tags"),
            @Mapping(target = "commentDTOS", source = "comments")})
    List<PostReadDTO> postEntityList2PostReadDtoList(List<Post> posts);

    @Mappings({
            @Mapping(target="tags", source = "tagDTOS"),
            @Mapping(target = "comments", source = "commentDTOS")})
    List<Post> postReadDtoList2PostEntityList(List<PostReadDTO> postReadDTOS);

    @Mappings({
            @Mapping(target="tagDTOS", source = "tags"),
            @Mapping(target = "commentDTOS", source = "comments")})
    PostReadDTO postEntity2PostReadDto(Post post);

    @Mappings({
            @Mapping(target="tags", source = "tagDTOS"),
            @Mapping(target = "comments", source = "commentDTOS")})
    Post postReadDto2PostEntity(PostReadDTO postReadDTO);





}


