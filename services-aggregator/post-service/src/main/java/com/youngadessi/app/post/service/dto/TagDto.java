package com.youngadessi.app.post.service.dto;

import com.youngadessi.app.post.service.entity.Post;
import com.youngadessi.app.post.service.entity.Tag;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TagDto {
    private String tagName;

    private List<Post> posts;
}
