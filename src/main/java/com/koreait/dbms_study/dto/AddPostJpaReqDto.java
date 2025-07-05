package com.koreait.dbms_study.dto;

import com.koreait.dbms_study.entity.JpaPost;

import java.time.LocalDateTime;

public class AddPostJpaReqDto {
    private String title;
    private String content;
    private Integer userId;

    public JpaPost toEntity() {
        return JpaPost.builder()
                .title(this.title)
                .content(this.content)
                .userId(this.userId)
                .createDt(LocalDateTime.now())
                .build();
    }
}
