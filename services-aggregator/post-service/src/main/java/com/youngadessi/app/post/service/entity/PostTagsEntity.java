package com.youngadessi.app.post.service.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "post_tags")
@Getter
@Setter
public class PostTagsEntity {

    //sor primary key zorunlu
    @Id
    private Long id;

    @Column(name = "id")
    private Long postId;

    @Column(name = "tag_id")
    private Long tagId;
}
