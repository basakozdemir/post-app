package com.youngadessi.app.post.service.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PostUpdateDTO {


    private String title;

    //we do not want to change content of a post
    //private String content;

    //private List<CommentCreateDTO> commentCreateDTOS;

    private List<TagDTO> tagDTOS;
}
