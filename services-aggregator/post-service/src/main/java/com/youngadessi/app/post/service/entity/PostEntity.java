package com.youngadessi.app.post.service.entity;

import com.youngadessi.app.common.sql.model.BaseEntity;
import com.youngadessi.app.user.service.model.UserEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tbl_post")
@Getter
@Setter
public class PostEntity extends BaseEntity {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    /*
    @Column(name = "author_id")
    private Long authorId;
    */

    @ManyToOne
    @JoinColumn(name = "author_id")
    private UserEntity user;

    @ManyToMany
    private List<TagEntity> tagList;

    @OneToMany
    private List<CommentEntity> commentList;
}
