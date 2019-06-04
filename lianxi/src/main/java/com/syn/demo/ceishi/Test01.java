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
    return "你好么？";

    }
}
