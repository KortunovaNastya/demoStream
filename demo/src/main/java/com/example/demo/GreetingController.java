package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {
    @GetMapping
    public  String greet(@RequestParam String name){
        return "Amodusik " + name;
    }

    @GetMapping("/full")
    public String fullGreeting(@RequestParam String name,
                               @RequestParam String surname){
        return "You're sus " + name + " " + surname;
    }
}
