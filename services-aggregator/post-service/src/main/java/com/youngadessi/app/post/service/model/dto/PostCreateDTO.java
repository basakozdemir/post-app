package com.youngadessi.app.post.service.model.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
public class PostCreateDTO {

    private String title;

    private String content;

    //private List<CommentDTO> commentDTOS;

    private List<TagDTO> tagDTOS;
}
