package com.jinseon.boardproject.domain;

import java.util.Objects;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@Table(indexes = {
	@Index(columnList = "content"),
	@Index(columnList = "createdAt"),
	@Index(columnList = "createdBy")
})
@EntityListeners(AuditingEntityListener.class)
@Entity
public class ArticleComment extends AuditingFields {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

	@Setter @ManyToOne(optional = false) private UserAccount userAccount; // 유저 정보 (ID)
	@Setter @ManyToOne(optional = false) private Article article; // 게시글 (ID)

	@Setter @Column(nullable = false, length = 500) private String content; // 내용

	protected ArticleComment() {
	}

	private ArticleComment(Article article, UserAccount userAccount, String content) {
		this.article = article;
		this.userAccount = userAccount;
		this.content = content;
	}

	public static ArticleComment of(Article article, UserAccount userAccount, String content) {
		return new ArticleComment(article, userAccount, content);

	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		ArticleComment that = (ArticleComment)o;
		return id != null && id.equals(that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}

