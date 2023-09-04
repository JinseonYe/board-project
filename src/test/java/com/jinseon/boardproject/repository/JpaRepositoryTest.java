package com.jinseon.boardproject.repository;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;

import com.jinseon.boardproject.BoardProjectApplication;
import com.jinseon.boardproject.config.JpaConfig;
import com.jinseon.boardproject.domain.Article;
import com.jinseon.boardproject.domain.UserAccount;
import com.jinseon.boardproject.repository.ArticleCommentRepository;
import com.jinseon.boardproject.repository.ArticleRepository;

@DisplayName("JPA 연결 테스트")
@Import(JpaConfig.class)
@DataJpaTest
@ContextConfiguration(classes = BoardProjectApplication.class)
class JpaRepositoryTest {
	private final ArticleRepository articleRepository;
	private final ArticleCommentRepository articleCommentRepository;
	private final UserAccountRepository userAccountRepository;

	public JpaRepositoryTest(
		@Autowired ArticleRepository articleRepository,
		@Autowired ArticleCommentRepository articleCommentRepository,
		@Autowired UserAccountRepository userAccountRepository
	) {
		this.articleRepository = articleRepository;
		this.articleCommentRepository = articleCommentRepository;
		this.userAccountRepository = userAccountRepository;
	}

	@DisplayName("select 테스트")
	@Test
	void givenTestData_whenSelecting_thenWorksFine() {
		//given

		//when
		List<Article> articles = articleRepository.findAll();

		//then
		assertThat(articles)
			.isNotNull()
			.hasSize(10);
	}

	@DisplayName("insert 테스트")
	@Test
	void givenTestData_whenInserting_thenWorksFine() {
		//given
		long previousCount = articleRepository.count();
		UserAccount userAccount = userAccountRepository.save(UserAccount.of("jinseon", "pw", null, null, null));
		Article article = articleRepository.save(Article.of(userAccount,"new article", "new content", "#spring"));


		//when
		articleRepository.save(article);

		//then
		assertThat(articleRepository.count()).isEqualTo(previousCount + 1);
	}

	@DisplayName("update 테스트")
	@Test
	void givenTestData_whenUpdating_thenWorksFine() {
		//given
		Article article = articleRepository.findById(1L).orElseThrow();
		String updatedHashtag = "#springboot";
		article.setHashtag(updatedHashtag);

		//when
		Article savedArticle = articleRepository.saveAndFlush(article);

		//then
		assertThat(savedArticle).hasFieldOrPropertyWithValue("hashtag", updatedHashtag);
	}

	@DisplayName("delete 테스트")
	@Test
	void givenTestData_whenDeleting_thenWorksFine() {
		//given
		Article article = articleRepository.findById(1L).orElseThrow();
		long previousArticleCount = articleRepository.count();
		long previousArticleCommentCount = articleCommentRepository.count();
		int deletedCommentSize = article.getArticleComments().size();

		//when
		articleRepository.delete(article);

		//then
		assertThat(articleRepository.count()).isEqualTo(previousArticleCount - 1);
		assertThat(articleCommentRepository.count()).isEqualTo(previousArticleCommentCount - deletedCommentSize);
	}
}