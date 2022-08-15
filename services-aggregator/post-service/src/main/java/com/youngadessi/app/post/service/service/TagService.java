package com.youngadessi.app.post.service.service;

import com.youngadessi.app.post.service.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TagService {

    private final TagRepository tagRepository;


}
