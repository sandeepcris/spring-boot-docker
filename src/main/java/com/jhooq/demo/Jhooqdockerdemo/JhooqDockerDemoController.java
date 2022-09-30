package com.jhooq.demo.Jhooqdockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JhooqDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "New Version 1.1 Docker Demo - Hello Jhooq";
    }
    @GetMapping("/test")
    public String test() {
        return "This is test";
    }

}
