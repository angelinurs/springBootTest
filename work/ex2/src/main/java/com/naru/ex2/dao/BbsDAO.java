package com.naru.ex2.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naru.ex2.vo.BbsVO;

// @Service 해주지 않으면 하단에 @Autowired 가 안됨.
@Service
public class BbsDAO {

    @Autowired
    private SqlSessionTemplate ss;

    public int getTotalCount(String bname) {

        return ss.selectOne("bbs.total_count", bname);

    }

    public BbsVO[] getList(String begin, String end, String bname) {

        Map<String, String> map = new HashMap<>();
        map.put("begin", begin);
        map.put("end", end);
        map.put("bname", bname);

        List<BbsVO> list = ss.selectList("bbs.list", map);

        BbsVO[] ar = null;

        if (list != null && list.size() > 0) {
            ar = new BbsVO[list.size()];
            list.toArray(ar);
        }
        return ar;
    }

    // 게시글 저장
    public int add(BbsVO vo) {
        System.out.println(vo.getBname());

        int cnt = ss.insert("bbs.add", vo);

        return cnt;
    }
}
