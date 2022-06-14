package com.youngadessi.app.user.service.model;

import com.youngadessi.app.common.sql.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_user",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"username"}),
        @UniqueConstraint(columnNames = {"email"})
},indexes = {
        @Index(columnList = "fullname")
})
@Getter
@Setter
public class User extends BaseEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "fullname")
    private String fullname;

    @NotNull
    @NotBlank
    @Column(name = "username")
    private String username;

    @NotNull
    @NotBlank
    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

}
