package com.youngadessi.app.post.service.dto;

import com.youngadessi.app.post.service.entity.Comment;
import com.youngadessi.app.post.service.entity.Tag;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PostDto {

    private String title;

    private String content;

    private List<Comment> comments;

    private List<Tag> tags;
}
