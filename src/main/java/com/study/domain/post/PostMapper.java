package com.study.domain.post;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {


    void save(PostRequest params);

    PostResponse findById(Long id);

    void update(PostRequest params);

    void deleteById(Long id);

    List<PostResponse> findAll();

    int count();

}
