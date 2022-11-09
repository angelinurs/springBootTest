package com.naru.ex1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naru.ex1.vo.EmpVO;
import com.naru.ex1.vo.TestVO;

import org.springframework.web.bind.annotation.RequestParam;

// @Controller
// @RestController -> controller 와 responseBody 가 합쳐진 상태
@RestController
public class TestController {

    @Value("${global.guestId}")
    private String guestId;

    @RequestMapping("/t1")
    // @ResponseBody
    public String test() {

        return "Hello, " + guestId + " Spring!!";
    }

    @GetMapping("test/{var}")
    public String varTest(@PathVariable("var") String v1) {
        return "받은 경로 : " + v1;
    }

    @GetMapping("test2/{var}")
    public String getMethodName(@PathVariable String var) {
        return "받은 경로 : " + var;
    }

    @GetMapping("/test3")
    public String paramTest(String name, String age) {
        return "받은 파라미터 : " + name + " " + age;
    }

    @GetMapping("/test4")
    public String paramTest2(@RequestParam String name, String age) {
        // 무조건 전달되어야 할 parameter 의 경우 @RequestParam 이라는 키워드를 넣어줘야 한다.
        // 이 경우 파라미터 값이 안넘어올 경우 Error 가 발생한다.
        return "받은 파라미터 : " + name + " " + age;
    }

    @GetMapping("/data")
    public String req(@RequestParam int v1) {
        TestVO vo = new TestVO();
        vo.setId(guestId);
        vo.setValue(v1);

        TestVO tvo = new TestVO(guestId, v1);

        return vo.getId() + ": " + vo.getValue() + ": " + tvo.toString();
    }

    @GetMapping("/data2")
    // vo 객체를 통해 값을 입력받는다.
    public String req1(TestVO vo) {
        return vo.toString();
    }

    @GetMapping("/data3")
    public Map<String, Object> req2() {
        Map<String, Object> map = new HashMap<>();

        TestVO t1 = new TestVO("100", 0);
        TestVO t2 = new TestVO("200", 1);

        TestVO[] ar = new TestVO[2];

        ar[0] = t1;
        ar[1] = t2;

        map.put("length", ar.length);
        map.put("ar", ar);

        return map;

    }

    @RequestMapping("/emp")
    public Map<String, Object> getEmpList() {

        Map<String, Object> map = new HashMap<>();

        EmpVO[] elist = new EmpVO[5];

        elist[0] = new EmpVO("1", "Alice", "2000-10-30", "2022-10-31");
        elist[1] = new EmpVO("2", "Dorosi", "2000-10-20", "2022-10-20");
        elist[2] = new EmpVO("3", "Kiwi", "2000-10-10", "2022-10-10");
        elist[3] = new EmpVO("4", "Melon", "2000-09-30", "2022-09-30");
        elist[4] = new EmpVO("5", "Ramu", "2000-08-30", "2022-08-30");

        map.put("length", elist.length);
        map.put("elist", elist);

        return map;
    }

}
