package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@RequestMapping("bs")
@Slf4j
public class TestController {

    @GetMapping("chat")
    public String chat(HttpServletRequest request){
        return new Date().toString();
    }
}
