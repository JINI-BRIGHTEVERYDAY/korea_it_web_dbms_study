package com.koreait.dbms_study.service;


import com.koreait.dbms_study.dto.AddPostReqDto;
import com.koreait.dbms_study.entity.Post;
import com.koreait.dbms_study.repository.PostJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostJpaService {

    @Autowired
    private PostJpaRepository postJpaRepository;

    public Post addPost(AddPostReqDto addPostReqDto) {
        return postJpaRepository.save(addPostReqDto.toEntity());
    }
}
