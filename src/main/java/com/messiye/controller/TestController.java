package com.messiye.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye
 * @since : 2020/12/30
 **/
@RestController
public class TestController {

    @GetMapping("/test/{id}")
    public String test(@PathVariable("id") int id) {
        System.out.println("请求：" + id);
        return "输入ID：" + id;
    }
}
