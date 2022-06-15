package com.youngadessi.app.post.service.mapper;

import com.youngadessi.app.post.service.dto.PostDto;
import com.youngadessi.app.post.service.entity.Post;
import org.mapstruct.Mapper;

@Mapper
public interface PostMapper {
    Post postDto2PostEntity(PostDto postDto);
    PostDto postEntity2PostDto(Post post);
}
