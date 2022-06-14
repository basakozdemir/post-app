package com.youngadessi.app.post.service.entity;

import com.youngadessi.app.common.sql.model.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

// predefined values
// book, sport, cinema, politics, journey, sight
@Entity
@Table(name = "tbl_tag")
public class Tag extends BaseEntity {

    @NotNull
    @NotBlank
    @Column(name = "tag_name")
    private String tagName;

}
