package com.example.myboard.domain.projection;

import com.example.myboard.domain.ArticleComment;
import com.example.myboard.domain.UserAccount;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDateTime;

@Projection(name = "withUserAccount", types = ArticleComment.class)
public interface ArticleCommentProjection {
    Long getId();
    UserAccount getUserAccount();
    Long getParentCommentId();
    String getContent();
    LocalDateTime getCreatedAt();
    String getCreatedBy();
    LocalDateTime getModifiedAt();
    String getModifiedBy();
}
