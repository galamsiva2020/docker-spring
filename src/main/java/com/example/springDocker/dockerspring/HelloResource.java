package com.example.springDocker.dockerspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker/spring/hello")
public class HelloResource {

    @GetMapping
    public String hello(){
        return "Sivakrishna got the job in Germany already";
    }
}
