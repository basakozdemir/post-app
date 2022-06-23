package com.youngadessi.app.post.service.service;

import com.youngadessi.app.post.service.mapper.PostMapper;
import com.youngadessi.app.post.service.model.dto.PostCreateDTO;
import com.youngadessi.app.post.service.model.entity.Post;
import com.youngadessi.app.post.service.model.entity.Tag;
import com.youngadessi.app.post.service.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    //private final CommentRepository commentRepository;

    private static final PostMapper POST_MAPPER = Mappers.getMapper(PostMapper.class);
    //private static final CommentMapper COMMENT_MAPPER = Mappers.getMapper(CommentMapper.class);
    //private static final TagMapper TAG_MAPPER = Mappers.getMapper(TagMapper.class);
    public void createPost(PostCreateDTO postCreateDTO) {

        //postRepository.save(POST_MAPPER.postDto2PostEntity(postCreateDTO));

        Post post = new Post();
        post.setContent(postCreateDTO.getContent());
        post.setTitle(post.getTitle());
        //post.setComments(postCreateDTO.getCommentCreateDTOS());



    }
}
