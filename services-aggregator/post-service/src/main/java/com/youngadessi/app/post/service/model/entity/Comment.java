package com.youngadessi.app.post.service.model.entity;

import com.youngadessi.app.common.sql.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_comment")
@Getter
@Setter
public class Comment extends BaseEntity {

    @NotNull
    @NotBlank
    @Column(name = "comment_text")
    private String commentText;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

}
