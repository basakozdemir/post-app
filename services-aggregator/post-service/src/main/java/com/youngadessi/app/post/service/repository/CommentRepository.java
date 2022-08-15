package com.youngadessi.app.post.service.repository;

import com.youngadessi.app.post.service.model.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
