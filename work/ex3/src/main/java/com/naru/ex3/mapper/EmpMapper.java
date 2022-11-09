package com.naru.ex3.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.naru.ex3.vo.EmpVO;

public interface EmpMapper {
    // emp.xml 존재하는 id 와 동일한 명칭의 추상 메서드 정의
    public List<EmpVO> list(@Param("begin") String begin, @Param("end") String end) throws Exception;

    public EmpVO getEmp(String emp_no) throws Exception;

    public int add(EmpVO vo) throws Exception;
}
