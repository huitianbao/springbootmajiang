package com.htb.mawen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: htb
 * @createDate: 2019/12/20
 * @version: 1.0
 */
@Controller
public class IndexCtrl {
    @RequestMapping("mawen/index")
    public String getIndex(Model model){

        return "index";
    }
}
