package com.mioApiJava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/welcome")
    public String showHelloPage() {
        return "hello.html"; // This corresponds to the name of your HTML or Thymeleaf template
    }
}