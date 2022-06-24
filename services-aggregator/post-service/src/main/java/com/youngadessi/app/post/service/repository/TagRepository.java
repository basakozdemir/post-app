package com.youngadessi.app.post.service.repository;

import com.youngadessi.app.post.service.model.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findTagByTagName(String tagName);
}
