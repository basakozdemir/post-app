package com.youngadessi.app.post.service.model.dto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TagCreateDTO {
    private String tagName;

    private List<PostCreateDTO> postCreateDTOS;
}
