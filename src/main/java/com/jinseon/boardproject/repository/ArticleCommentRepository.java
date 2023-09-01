package com.jinseon.boardproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jinseon.boardproject.domain.ArticleComment;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}