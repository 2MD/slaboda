package ru.mkalinina.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:3000")
@RestController
public class MainController {
    @GetMapping(value = "/test")
    public String index() {
        return "Hello World!";
    }

}
