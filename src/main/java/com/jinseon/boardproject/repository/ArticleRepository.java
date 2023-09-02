package com.jinseon.boardproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jinseon.boardproject.domain.Article;
import com.jinseon.boardproject.domain.QArticle;
import com.querydsl.core.types.dsl.DateTimeExpression;
import com.querydsl.core.types.dsl.SimpleExpression;
import com.querydsl.core.types.dsl.StringExpression;

@RepositoryRestResource
public interface ArticleRepository extends
	JpaRepository<Article, Long>,
	QuerydslPredicateExecutor<Article>,
	QuerydslBinderCustomizer<QArticle> {

	@Override
	default void customize(QuerydslBindings bindings, QArticle root) {
		bindings.excludeUnlistedProperties(true);
		bindings.including(root.title, root.content, root.hashtag, root.createAt, root.createBy);
		bindings.bind(root.title).first(StringExpression::containsIgnoreCase);
		bindings.bind(root.content).first(StringExpression::containsIgnoreCase);
		bindings.bind(root.hashtag).first(StringExpression::containsIgnoreCase);
		bindings.bind(root.createAt).first(DateTimeExpression::eq);
		bindings.bind(root.createBy).first(StringExpression::containsIgnoreCase);
	}
}
