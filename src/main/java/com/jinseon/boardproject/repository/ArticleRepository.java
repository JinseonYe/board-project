package com.jinseon.boardproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jinseon.boardproject.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
