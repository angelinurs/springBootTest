package com.naru.ex3.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmpVO {
    private String emp_no;
    private String first_name;
    private String last_name;
    private String birth_date;
    private String gender;
    private String hire_date;
}
