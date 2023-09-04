package com.jinseon.boardproject.service;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.jinseon.boardproject.domain.Article;
import com.jinseon.boardproject.dto.ArticleCommentDto;
import com.jinseon.boardproject.repository.ArticleCommentRepository;
import com.jinseon.boardproject.repository.ArticleRepository;

@DisplayName("비즈니스 로직 - 댓글")
@ExtendWith(MockitoExtension.class)
class ArticleCommentServiceTest {

	@InjectMocks private  ArticleCommentService sut;

	@Mock private ArticleCommentRepository articleCommentRepository;
	@Mock private ArticleRepository articleRepository;

	@DisplayName("댓글 정보를 입력하면, 댓글을 저장한다.")
	@Test
	void givenArticleId_whenSearchingArticleComments_thenReturnsArticleComments() {
		//given
		Long articleId = 1L;
		given(articleRepository.findById(articleId)).willReturn(Optional.of(
			Article.of("title", "comment", "#java"))
		);

		//when
		List<ArticleCommentDto> articleComments = sut.searchArticleComment(articleId);

		//then
		assertThat(articleComments).isNotNull();
		then(articleRepository).should().findById(articleId);
	}

}