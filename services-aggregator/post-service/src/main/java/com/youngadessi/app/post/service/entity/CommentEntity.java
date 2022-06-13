package com.youngadessi.app.post.service.entity;

import com.youngadessi.app.common.sql.model.BaseEntity;
import com.youngadessi.app.user.service.model.UserEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_comment")
@Getter
@Setter
public class CommentEntity extends BaseEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "comment_text")
    private String commentText;
/*
    @Column(name = "user_id")
    private String userId;

    @Column(name = "post_id")
    private String postId;
*/
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private PostEntity post;


}
