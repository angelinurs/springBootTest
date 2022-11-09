package com.naru.ex1.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// data 객체를 의미하는 annotation 을 설정하면
// 추가적인 getter setter 를 정의할 필요가 없다.
@Data
// 비어 있는 생성자 기본 생성자를 만들어 준다.
@NoArgsConstructor
// 모든 맴버변수의 값을 받는 생성자를 만든다.
@AllArgsConstructor
public class TestVO {
    private String id;
    private int value;
}
