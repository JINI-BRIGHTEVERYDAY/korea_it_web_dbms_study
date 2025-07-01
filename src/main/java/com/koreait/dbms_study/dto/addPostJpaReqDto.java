package com.koreait.dbms_study.dto;

import com.koreait.dbms_study.entity.JpaPost;
import com.koreait.dbms_study.entity.Post;

public class addPostJpaReqDto {
    private String title;
    private String content;
    private Integer userId;

    public JpaPost toEntity() {
        return JpaPost.builder()
                .title(this.title)
                .content(this.content)
                .userId(this.userId)
                .build();
    }
}
