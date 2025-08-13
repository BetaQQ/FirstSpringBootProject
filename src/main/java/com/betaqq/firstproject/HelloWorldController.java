package com.betaqq.firstproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/betaqq/hello")
    public String HelloWorld(){
        return "Hello BetaQQ";
    }
}
