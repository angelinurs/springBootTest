package com.naru.ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naru.ex3.mapper.EmpMapper;
import com.naru.ex3.vo.EmpVO;

@Service
public class EmpService {

    @Autowired
    private EmpMapper mapper;

    // 한 페이지에 보여질 사원들 목록을 반환 하는 business 구현
    public EmpVO[] getList(String begin, String end) throws Exception {
        EmpVO[] elist = null;

        List<EmpVO> list = mapper.list(begin, end);

        if (list != null && list.size() > 0) {
            elist = new EmpVO[list.size()];
            list.toArray(elist);
        }

        return elist;
    }

    // 사번으로 사원 검색하기
    public EmpVO getEmp(String emp_no) throws Exception {

        return mapper.getEmp(emp_no);
    }
}
