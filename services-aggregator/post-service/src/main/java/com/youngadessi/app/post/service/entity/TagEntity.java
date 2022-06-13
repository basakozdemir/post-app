package com.youngadessi.app.post.service.entity;

import com.youngadessi.app.common.sql.model.BaseEntity;
import com.youngadessi.app.user.service.model.UserEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_tag")
@Getter
@Setter
public class TagEntity extends BaseEntity {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "tag_name")
    private String tagName;

    /*
    @Column(name = "author_id")
    private Long authorId;
    */

    @ManyToOne
    @JoinColumn(name = "author_id")
    private UserEntity user;

    @ManyToMany(mappedBy = "tagList")
    private List<PostEntity> postList;
}
