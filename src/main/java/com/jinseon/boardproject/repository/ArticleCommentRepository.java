package com.jinseon.boardproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jinseon.boardproject.domain.Article;
import com.jinseon.boardproject.domain.ArticleComment;
import com.jinseon.boardproject.domain.QArticle;
import com.jinseon.boardproject.domain.QArticleComment;
import com.querydsl.core.types.dsl.DateTimeExpression;
import com.querydsl.core.types.dsl.StringExpression;

@RepositoryRestResource
public interface ArticleCommentRepository extends
	JpaRepository<ArticleComment, Long>,
	QuerydslPredicateExecutor<ArticleComment>,
	QuerydslBinderCustomizer<QArticleComment> {

	@Override
	default void customize(QuerydslBindings bindings, QArticleComment root) {
		bindings.excludeUnlistedProperties(true);
		bindings.including(root.content, root.createAt, root.createBy);
		bindings.bind(root.content).first(StringExpression::containsIgnoreCase);
		bindings.bind(root.createAt).first(DateTimeExpression::eq);
		bindings.bind(root.createBy).first(StringExpression::containsIgnoreCase);
	}
}
