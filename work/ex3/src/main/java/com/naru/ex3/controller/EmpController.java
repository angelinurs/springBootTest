package com.naru.ex3.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naru.ex3.service.EmpService;
import com.naru.ex3.vo.EmpVO;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService e_service;

    @RequestMapping("/list")
    public Map<String, Object> list(String cPage) throws Exception {
        // 현재 페이지 값으로 begin 과 end 값을 구해야 한다.
        // Pagin Object 활용을 해야한다.
        String begin = "1";
        String end = "10";

        EmpVO[] ar = e_service.getList(begin, end);

        // 반환 준비
        Map<String, Object> map = new HashMap<>();
        map.put("list", ar);

        return map;
    }

    @RequestMapping("/get")
    public Map<String, Object> get(String emp_no) throws Exception {
        EmpVO vo = e_service.getEmp(emp_no);

        Map<String, Object> map = new HashMap<>();
        map.put("emp", vo);
        return map;
    }

}
