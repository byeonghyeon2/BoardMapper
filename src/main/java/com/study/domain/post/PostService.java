package com.study.domain.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostMapper postMapper;

    @Transactional
    public Long savePost(final PostRequest params) {
        postMapper.save(params);
        return params.getId();
    }

    public PostResponse findPostById(final Long id) {
        return postMapper.findById(id);
    }

    @Transactional
    public Long updatePost(final PostRequest params) {
        postMapper.update(params);
        return params.getId();
    }

    public Long deletePost(final Long id) {
        postMapper.deleteById(id);
        return id;
    }

    public List<PostResponse> findAllPost() {
        return postMapper.findAll();
    }

}