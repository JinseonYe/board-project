package com.jinseon.boardproject.dto;

import java.time.LocalDateTime;

public record ArticleCommentDto(
	LocalDateTime createdAt,
	String createdBy,
	LocalDateTime modifiedAt,
	String modifiedBy,
	String title,
	String content
) {
	public static ArticleCommentDto of(LocalDateTime createdAt, String createdBy, LocalDateTime modifiedAt, String modifiedBy, String title, String content, String hashtag) {
		return new ArticleCommentDto(createdAt, createdBy, modifiedAt, modifiedBy, title, content);
	}
}
