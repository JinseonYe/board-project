INSERT INTO article (title, content, hashtag, create_at, create_by, modified_at, modified_by)
VALUES
    ('제목1', '내용1', '해시태그1', CURRENT_TIMESTAMP, '생성자1', CURRENT_TIMESTAMP, '수정자1'),
    ('제목2', '내용2', '해시태그2', CURRENT_TIMESTAMP, '생성자2', CURRENT_TIMESTAMP, '수정자2'),
    ('제목3', '내용3', '해시태그3', CURRENT_TIMESTAMP, '생성자3', CURRENT_TIMESTAMP, '수정자3'),
    ('제목4', '내용4', '해시태그4', CURRENT_TIMESTAMP, '생성자4', CURRENT_TIMESTAMP, '수정자4'),
    ('제목5', '내용5', '해시태그5', CURRENT_TIMESTAMP, '생성자5', CURRENT_TIMESTAMP, '수정자5'),
    ('제목6', '내용6', '해시태그6', CURRENT_TIMESTAMP, '생성자6', CURRENT_TIMESTAMP, '수정자6'),
    ('제목7', '내용7', '해시태그7', CURRENT_TIMESTAMP, '생성자7', CURRENT_TIMESTAMP, '수정자7'),
    ('제목8', '내용8', '해시태그8', CURRENT_TIMESTAMP, '생성자8', CURRENT_TIMESTAMP, '수정자8'),
    ('제목9', '내용9', '해시태그9', CURRENT_TIMESTAMP, '생성자9', CURRENT_TIMESTAMP, '수정자9'),
    ('제목10', '내용10', '해시태그10', CURRENT_TIMESTAMP, '생성자10', CURRENT_TIMESTAMP, '수정자10');

INSERT INTO article_comment (article_id, content, create_at, create_by, modified_at, modified_by)
VALUES
    (1, '댓글 내용 1', CURRENT_TIMESTAMP, '댓글 작성자 1', CURRENT_TIMESTAMP, '댓글 수정자 1'),
    (1, '댓글 내용 2', CURRENT_TIMESTAMP, '댓글 작성자 2', CURRENT_TIMESTAMP, '댓글 수정자 2'),
    (2, '댓글 내용 3', CURRENT_TIMESTAMP, '댓글 작성자 3', CURRENT_TIMESTAMP, '댓글 수정자 3'),
    (2, '댓글 내용 4', CURRENT_TIMESTAMP, '댓글 작성자 4', CURRENT_TIMESTAMP, '댓글 수정자 4'),
    (3, '댓글 내용 5', CURRENT_TIMESTAMP, '댓글 작성자 5', CURRENT_TIMESTAMP, '댓글 수정자 5'),
    (3, '댓글 내용 6', CURRENT_TIMESTAMP, '댓글 작성자 6', CURRENT_TIMESTAMP, '댓글 수정자 6'),
    (4, '댓글 내용 7', CURRENT_TIMESTAMP, '댓글 작성자 7', CURRENT_TIMESTAMP, '댓글 수정자 7'),
    (4, '댓글 내용 8', CURRENT_TIMESTAMP, '댓글 작성자 8', CURRENT_TIMESTAMP, '댓글 수정자 8'),
    (5, '댓글 내용 9', CURRENT_TIMESTAMP, '댓글 작성자 9', CURRENT_TIMESTAMP, '댓글 수정자 9'),
    (5, '댓글 내용 10', CURRENT_TIMESTAMP, '댓글 작성자 10', CURRENT_TIMESTAMP, '댓글 수정자 10');