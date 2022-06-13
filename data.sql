CREATE SCHEMA post_schema;
CREATE SCHEMA user_schema;
CREATE TABLE post_schema.tbl_comment(
     id int not null,
     comment_text varchar(50),
     user_id int not null,
     post_id int not null,
     create_timestamp timestamp,
     update_timestamp timestamp,
     status bool,
     PRIMARY KEY(id)
);

CREATE TABLE post_schema.tbl_post(
    id int not null,
    title varchar(50),
    content varchar(50),
    author_id int not null,
    create_timestamp timestamp,
    update_timestamp timestamp,
    status bool,
    PRIMARY KEY(id)
);

CREATE TABLE post_schema.tbl_tag(
    id int not null,
    tag_name varchar(50),
    author_id int not null,
    create_timestamp timestamp,
    update_timestamp timestamp,
    status bool,
    PRIMARY KEY(id)
);

CREATE TABLE post_schema.tbl_post_tags(
    post_id int not null,
    tag_id int not null
);

CREATE TABLE user_schema.tbl_user(
    id int not null,
    username varchar(50),
    password varchar(50),
    email varchar(50),
    create_timestamp timestamp,
    update_timestamp timestamp,
    status bool,
    PRIMARY KEY(id)

);


ALTER TABLE if exists post_schema.tbl_comment
ADD CONSTRAINT cp_id_fk FOREIGN KEY (post_id) REFERENCES post_schema.tbl_post(id),
ADD CONSTRAINT cu_id_fk FOREIGN KEY (user_id) REFERENCES user_schema.tbl_user(id);

ALTER TABLE if exists post_schema.tbl_post
ADD CONSTRAINT pa_id_fk FOREIGN KEY (author_id) REFERENCES user_schema.tbl_user(id);

ALTER TABLE if exists post_schema.tbl_tag
ADD CONSTRAINT ta_id_fk FOREIGN KEY (author_id) REFERENCES user_schema.tbl_user(id);

ALTER TABLE if exists post_schema.tbl_post_tags
ADD CONSTRAINT tp_id_fk FOREIGN KEY (post_id) REFERENCES post_schema.tbl_post(id),
ADD CONSTRAINT tt_id_fk FOREIGN KEY (tag_id) REFERENCES post_schema.tbl_tag(id);

