package com.youngadessi.app.post.service.dto;

import com.youngadessi.app.post.service.entity.Post;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDto {


    private String commentText;

    private Post post;
}
