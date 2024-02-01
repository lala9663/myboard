package com.example.myboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private String article;
    private String content;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
