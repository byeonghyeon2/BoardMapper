package com.study.domain.post;

import com.study.common.dto.SearchDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {


    void save(PostRequest params);

    PostResponse findById(Long id);

    void update(PostRequest params);

    void deleteById(Long id);

    List<PostResponse> findAll(SearchDto params);

    int count(SearchDto params);

}
