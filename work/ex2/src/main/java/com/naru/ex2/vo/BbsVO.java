package com.naru.ex2.vo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BbsVO {
    String b_idx;
    String subject;
    String writer;
    String content;
    String file_name;
    String ori_name;
    String pwd;
    String write_date;
    String ip;
    String hit;
    String status;
    String bname;
    // mybatis result map 활용
    List<CommentVO> commentList;
}