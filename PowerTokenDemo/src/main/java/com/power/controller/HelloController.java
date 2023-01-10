package com.power.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author power
 * @Date 2023/1/10 10:26
 */
@RestController
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}