package com.example.session1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello/{name}")
    public String sayHelo(@PathVariable(value = "name") String name) {
        if (name.equals(name.toUpperCase())) {
            return "HELLO, " + name;
        }

        return "Hello, " + name;
    }
}
