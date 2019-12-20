package com.htb.mawen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: htb
 * @createDate: 2019/12/20
 * @version: 1.0
 */

@Controller
//@RestController
public class Hello {
    @GetMapping("mawen/hello")
    public String greeting(@RequestParam(value = "name",defaultValue = "htb") String name, Model model){
        //在注解上 按 ctrl + p 显示注解需要的参数

        model.addAttribute("name" ,name);

        return  "greeting";
    }

}
