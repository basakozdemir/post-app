package com.youngadessi.app.post.service.repository;

import com.youngadessi.app.post.service.model.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    Post findByIdIs(Long id);
    List<Post> findByTitle(String titleText);

    Boolean existsPostByTitle(String title);
}
