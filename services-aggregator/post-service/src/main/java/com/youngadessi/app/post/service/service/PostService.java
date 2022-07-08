package com.youngadessi.app.post.service.service;

import com.youngadessi.app.post.service.mapper.PostMapper;
import com.youngadessi.app.post.service.mapper.TagMapper;
import com.youngadessi.app.post.service.model.dto.PostCreateDTO;
import com.youngadessi.app.post.service.model.dto.PostReadDTO;
import com.youngadessi.app.post.service.model.dto.PostUpdateDTO;
import com.youngadessi.app.post.service.model.dto.TagDTO;
import com.youngadessi.app.post.service.model.entity.Post;
import com.youngadessi.app.post.service.model.entity.Tag;
import com.youngadessi.app.post.service.repository.PostRepository;
import com.youngadessi.app.post.service.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private static final PostMapper POST_MAPPER = Mappers.getMapper(PostMapper.class);
    //private static final TagMapper TAG_MAPPER = Mappers.getMapper(TagMapper.class);

    public void createPost(PostCreateDTO postCreateDTO) {
        postRepository.save(POST_MAPPER.postCreateDto2PostEntity(postCreateDTO));
    }

    public Boolean deletePost(Long postId){
        if(postRepository.existsById(postId)){
            postRepository.deleteById(postId);
            return true;
        }
        else return false;
    }

    public void updatePost(Long postId, PostUpdateDTO postUpdateDTO){
        Optional<Post> optionalPost = postRepository.findById(postId);
        Post post = optionalPost.orElseThrow(()->new RuntimeException("Post object with id "+postId+" not found on database"));
        Post post1 = POST_MAPPER.postUpdateDto2PostEntity(postUpdateDTO);
        post.setTitle(post1.getTitle());
        post.setTags(post1.getTags());
        postRepository.save(post);
    }

    public List<PostReadDTO> searchByTitle(String titleText){
        if(postRepository.existsPostByTitle(titleText)){
            List<Post> postList = postRepository.findByTitle(titleText);
            return POST_MAPPER.postEntityList2PostReadDtoList(postList);
        }
        else throw new RuntimeException("Post object with title="+ titleText+" not found on database.");
    }

    public PostReadDTO searchById(Long postId) {
        Post post = postRepository.findByIdIs(postId);
        return POST_MAPPER.postEntity2PostReadDto(post);
    }

}
