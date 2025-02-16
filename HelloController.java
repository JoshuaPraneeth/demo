package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
    @GetMapping("/bye")
    public String sayBye() {
        return "bye, Spring Boot!";
    }
    @PostMapping("/greet")
    public String greetUser(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
    @GetMapping("/greet1/{name}")
    public String greetUser1(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}


