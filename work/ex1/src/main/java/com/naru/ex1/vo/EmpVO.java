package com.naru.ex1.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpVO {
    private String empNo;
    private String name;
    private String birthDate;
    private String fromDate;
}
