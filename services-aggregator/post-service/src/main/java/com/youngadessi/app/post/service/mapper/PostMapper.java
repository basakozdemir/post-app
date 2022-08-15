package com.youngadessi.app.post.service.mapper;

import com.youngadessi.app.post.service.model.dto.PostCreateDTO;
import com.youngadessi.app.post.service.model.entity.Post;
import org.mapstruct.Mapper;

@Mapper
public interface PostMapper {
    Post postDto2PostEntity(PostCreateDTO postCreateDto);
    PostCreateDTO postEntity2PostDto(Post post);
}
