package com.kradle.web.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebController {
    @GetMapping()
    public String test() {
        return "Hello World!";
    }
}
