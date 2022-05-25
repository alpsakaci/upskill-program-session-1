package com.example.session1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    private final GreetingService greetingService;

    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello world.";
    }

    @GetMapping("/hello/{names}")
    public String sayHello(@PathVariable(value = "names") String names) {
        return greetingService.sayHello(names);
    }

}
