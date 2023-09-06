package com.jinseon.boardproject.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jinseon.boardproject.dto.ArticleCommentDto;
import com.jinseon.boardproject.repository.ArticleCommentRepository;
import com.jinseon.boardproject.repository.ArticleRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ArticleCommentService {

	private final ArticleCommentRepository articleCommentRepository;
	private final ArticleRepository articleRepository;

	@Transactional(readOnly = true)
	public List<ArticleCommentDto> searchArticleComments(Long articleId) {
		return List.of();
	}

	public void saveArticleComment(ArticleCommentDto dto) {
	}

	public void updateArticleComment(ArticleCommentDto dto) {
	}

	public void deleteArticleComment(Long articleCommentId) {
	}
}
