package com.power.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author power
 * @Date 2023/1/9 17:12
 */
@RestController
@RequestMapping("/power")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
