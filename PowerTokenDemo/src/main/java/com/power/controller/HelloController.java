package com.power.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author power
 * @Date 2023/1/10 10:26
 */
@RestController
@RequestMapping("/test")
public class HelloController {

    @GetMapping("/hello")
    @PreAuthorize("hasAuthority('testaaa')")
    public String hello() {
        return "hello";
    }
}
