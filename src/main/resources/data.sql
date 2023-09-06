INSERT INTO user_account (user_id, user_password, nickname, email, memo, created_at, created_by, modified_at, modified_by)
VALUES ('johndoe', 'password123', 'johndoe@example.com', 'John Doe', 'This is a sample memo', CURRENT_TIMESTAMP, '생성자1', CURRENT_TIMESTAMP, '수정자1');;

INSERT INTO article (user_account_id, title, content, hashtag, created_at, created_by, modified_at, modified_by)
VALUES
    (1, '제목1', '내용1', '해시태그1', CURRENT_TIMESTAMP, '생성자1', CURRENT_TIMESTAMP, '수정자1'),
    (1, '제목2', '내용2', '해시태그2', CURRENT_TIMESTAMP, '생성자2', CURRENT_TIMESTAMP, '수정자2'),
    (1, '제목3', '내용3', '해시태그3', CURRENT_TIMESTAMP, '생성자3', CURRENT_TIMESTAMP, '수정자3'),
    (1, '제목4', '내용4', '해시태그4', CURRENT_TIMESTAMP, '생성자4', CURRENT_TIMESTAMP, '수정자4'),
    (1, '제목5', '내용5', '해시태그5', CURRENT_TIMESTAMP, '생성자5', CURRENT_TIMESTAMP, '수정자5'),
    (1, '제목6', '내용6', '해시태그6', CURRENT_TIMESTAMP, '생성자6', CURRENT_TIMESTAMP, '수정자6'),
    (1, '제목7', '내용7', '해시태그7', CURRENT_TIMESTAMP, '생성자7', CURRENT_TIMESTAMP, '수정자7'),
    (1, '제목8', '내용8', '해시태그8', CURRENT_TIMESTAMP, '생성자8', CURRENT_TIMESTAMP, '수정자8'),
    (1, '제목9', '내용9', '해시태그9', CURRENT_TIMESTAMP, '생성자9', CURRENT_TIMESTAMP, '수정자9'),
    (1, '제목10', '내용10', '해시태그10', CURRENT_TIMESTAMP, '생성자10', CURRENT_TIMESTAMP, '수정자10');

INSERT INTO article_comment (article_id, user_account_id, content, created_at, created_by, modified_at, modified_by)
VALUES
    (1, 1, '댓글 내용 1', CURRENT_TIMESTAMP, '댓글 작성자 1', CURRENT_TIMESTAMP, '댓글 수정자 1'),
    (1, 1, '댓글 내용 2', CURRENT_TIMESTAMP, '댓글 작성자 2', CURRENT_TIMESTAMP, '댓글 수정자 2'),
    (2, 1, '댓글 내용 3', CURRENT_TIMESTAMP, '댓글 작성자 3', CURRENT_TIMESTAMP, '댓글 수정자 3'),
    (2, 1, '댓글 내용 4', CURRENT_TIMESTAMP, '댓글 작성자 4', CURRENT_TIMESTAMP, '댓글 수정자 4'),
    (3, 1, '댓글 내용 5', CURRENT_TIMESTAMP, '댓글 작성자 5', CURRENT_TIMESTAMP, '댓글 수정자 5'),
    (3, 1, '댓글 내용 6', CURRENT_TIMESTAMP, '댓글 작성자 6', CURRENT_TIMESTAMP, '댓글 수정자 6'),
    (4, 1, '댓글 내용 7', CURRENT_TIMESTAMP, '댓글 작성자 7', CURRENT_TIMESTAMP, '댓글 수정자 7'),
    (4, 1, '댓글 내용 8', CURRENT_TIMESTAMP, '댓글 작성자 8', CURRENT_TIMESTAMP, '댓글 수정자 8'),
    (5, 1, '댓글 내용 9', CURRENT_TIMESTAMP, '댓글 작성자 9', CURRENT_TIMESTAMP, '댓글 수정자 9'),
    (5, 1, '댓글 내용 10', CURRENT_TIMESTAMP, '댓글 작성자 10', CURRENT_TIMESTAMP, '댓글 수정자 10');
