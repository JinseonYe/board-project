package com.jinseon.boardproject.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jinseon.boardproject.domain.type.SearchType;
import com.jinseon.boardproject.dto.ArticleDto;
import com.jinseon.boardproject.dto.ArticleUpdateDto;
import com.jinseon.boardproject.repository.ArticleRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {

	private final ArticleRepository articleRepository;

	@Transactional(readOnly = true)
	public Page<ArticleDto> searchArticles(SearchType title, String searchKeyword) {
		return Page.empty();
	}

	@Transactional(readOnly = true)
	public List<ArticleDto> searchArticle(long l) {
		return null;
	}

	public void saveArticle(ArticleDto dto) {
	}

	public void updateArticle(long articleId, ArticleUpdateDto dto) {
	}

	public void deleteArticle(long articleId) {
	}
}
