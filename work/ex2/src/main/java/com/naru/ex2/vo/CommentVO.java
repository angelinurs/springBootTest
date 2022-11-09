package com.naru.ex2.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentVO {
	String c_idx;
	String writer;
	String content;
	String pwd;
	String write_date;
	String ip;
	String b_idx;
	String cPage;
}