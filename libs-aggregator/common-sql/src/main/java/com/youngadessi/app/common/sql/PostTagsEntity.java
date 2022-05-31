package com.youngadessi.app.common.sql;

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
