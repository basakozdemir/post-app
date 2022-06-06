package com.youngadessi.app.post.service.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tag")
@Getter
@Setter
public class TagEntity {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "tag_name")
    private String tagName;

    @Column(name = "author_id")
    private Long authorId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "status")
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
