package com.jj.learning.spring_demo.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello () {
        return "Hello World!";
    }

    @RequestMapping("/goodbye")
    public String goodbye() {
        return "Goodbye";
    }

    @RequestMapping("/spanish")
    public String spanish() {
        return "adios!";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String hellothere(@RequestBody String name) {
        return "Hello, " + name + "!";
    }
}


