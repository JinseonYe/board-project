package com.jinseon.boardproject.dto;

import java.time.LocalDateTime;

public record ArticleDto(
	LocalDateTime createdAt,
	String createBy,
	String title,
	String content,
	String hashtag
) {
	public static ArticleDto of(LocalDateTime createdAt, String createBy, String title, String content, String hashtag) {
		return new ArticleDto(createdAt, createBy, title, content, hashtag);
	}
}
