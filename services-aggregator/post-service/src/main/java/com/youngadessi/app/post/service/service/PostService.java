package com.youngadessi.app.post.service.service;

import com.youngadessi.app.post.service.mapper.PostMapper;
import com.youngadessi.app.post.service.model.dto.PostCreateDTO;
import com.youngadessi.app.post.service.model.dto.TagDTO;
import com.youngadessi.app.post.service.model.entity.Post;
import com.youngadessi.app.post.service.model.entity.Tag;
import com.youngadessi.app.post.service.repository.PostRepository;
import com.youngadessi.app.post.service.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    //private final CommentRepository commentRepository;
    private final TagRepository tagRepository;

    private static final PostMapper POST_MAPPER = Mappers.getMapper(PostMapper.class);
    //private static final CommentMapper COMMENT_MAPPER = Mappers.getMapper(CommentMapper.class);
    //private static final TagMapper TAG_MAPPER = Mappers.getMapper(TagMapper.class);
    public void createPost(PostCreateDTO postCreateDTO) {
        Post post = new Post();
        postRepository.save(POST_MAPPER.postDto2PostEntity(postCreateDTO));
        //tagRepository.saveAll(POST_MAPPER.tagDto2TagEntity(postCreateDTO.getTagDTOS()));
        Tag tagByTagName = tagRepository.findTagByTagName(postCreateDTO.getTagDTOS().get(0).toString());

        post.setTitle(postCreateDTO.getTitle());
        post.setContent(postCreateDTO.getContent());
        post.setTags(tagByTagName);
        //System.out.println(postCreateDTO.getTitle());



    }


}
