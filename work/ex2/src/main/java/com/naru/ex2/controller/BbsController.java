package com.naru.ex2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naru.ex2.dao.BbsDAO;
import com.naru.ex2.util.Paging;
import com.naru.ex2.vo.BbsVO;

@RestController
@RequestMapping("/bbs")
public class BbsController {
    @Autowired
    private BbsDAO bbsDAO;

    private int nowPage;
    private int totalCount;
    private int numPerPage = 10;
    private int pagePerBlock = 5;

    @RequestMapping("/list")
    public Map<String, Object> list(String cPage, String bname) {

        System.out.println("cPage : " + cPage);

        if (bname == null)
            bname = "BBS";
        if (cPage == null) {
            nowPage = 1;
        } else {
            nowPage = Integer.parseInt(cPage);
        }

        totalCount = bbsDAO.getTotalCount(bname);

        Paging page = new Paging(nowPage, numPerPage, totalCount, pagePerBlock);

        int begin = page.getBegin();
        int end = page.getEnd();

        BbsVO[] ar = bbsDAO.getList(String.valueOf(begin), String.valueOf(end), bname);

        Map<String, Object> resMap = new HashMap<>();
        resMap.put("list", ar);

        return resMap;
    }

    @RequestMapping("/addBBS")
    public int write(BbsVO vo) {
        return bbsDAO.add(vo);
    }
}
