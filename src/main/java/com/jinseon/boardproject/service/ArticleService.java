package com.jinseon.boardproject.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jinseon.boardproject.domain.type.SearchType;
import com.jinseon.boardproject.dto.ArticleDto;
import com.jinseon.boardproject.dto.ArticleWithCommentsDto;
import com.jinseon.boardproject.repository.ArticleRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {

	private final ArticleRepository articleRepository;

	@Transactional(readOnly = true)
	public Page<ArticleDto> searchArticles(SearchType searchType, String searchKeyword, Pageable pageable) {
		return Page.empty();
	}

	@Transactional(readOnly = true)
	public ArticleWithCommentsDto getArticle(Long articleId) {
		return null;
	}

	public void saveArticle(ArticleDto dto) {
	}


	public void updateArticle(ArticleDto dto) {
	}

	public void deleteArticle(long articleId) {
	}
}
