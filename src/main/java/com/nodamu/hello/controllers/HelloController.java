package com.nodamu.hello.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author profnick
 * 9/24/20
 **/

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return  ResponseEntity.ok("Hello");
    }
}
