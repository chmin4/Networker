//댓글
package com.example.networker_test.domain.comment;

import java.time.LocalDateTime;

import com.example.networker_test.domain.post.Post;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Comment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;//댓글 고유번호
	
	@Column(columnDefinition = "TEXT")//댓글의 내용
	private String content;
	
	private LocalDateTime createDate;//댓글 작성일
	
    @ManyToOne
    private Post post;//하나의 게시물, 여러 댓글

}
