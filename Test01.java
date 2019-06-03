package com.syn.demo.ceishi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/song")
public class Test01 {

    @RequestMapping("/yi")
    @ResponseBody
    public String demo(){
    return "你好么？我第一次修改了，用到了git，我又修改了文件，这是第二次了";

    }
}
