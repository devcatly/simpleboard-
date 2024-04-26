package com.simple.simboard.repo;

import com.simple.simboard.domain.ArticleComment;
import com.simple.simboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}