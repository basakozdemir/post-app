package com.youngadessi.app.post.service.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PostReadDTO {

    private String title;

    private String content;

    private List<CommentDTO> commentDTOS;

    private List<TagDTO> tagDTOS;
}
