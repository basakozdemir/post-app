package com.youngadessi.app.user.service.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
public class UserEntity {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @OneToMany
    @JoinColumn(name = "author_id")
    private List<TagEntity> tags;

    @OneToMany
    @JoinColumn(name = "author_id")
    private List<PostEntity> posts;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<CommentEntity> comments;
}
