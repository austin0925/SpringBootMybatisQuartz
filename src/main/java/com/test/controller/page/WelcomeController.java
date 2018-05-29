package com.test.controller.page;

import com.test.Const;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping(value = Const.PAGE_PATH)
public class WelcomeController{

    @RequestMapping("/helloJsp")
    public String helloJsp(Map<String,Object> map){
        System.out.println(">>>>>>>>>>>>>>>> hello");
        map.put("hello", "Hi");

        return "page/helloJsp";

    }
}