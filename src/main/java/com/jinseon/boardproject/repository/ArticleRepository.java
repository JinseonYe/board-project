package com.jinseon.boardproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jinseon.boardproject.domain.Article;

@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
