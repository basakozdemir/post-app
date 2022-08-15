package com.youngadessi.app.post.service.repository;

import com.youngadessi.app.post.service.model.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
