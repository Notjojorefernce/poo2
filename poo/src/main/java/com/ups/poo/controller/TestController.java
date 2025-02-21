package com.ups.poo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String test(@RequestParam String name, @RequestParam String lastname) {
        return "IM COMING TO MAKE AN ANNOUNCMENT, SHADOW THE HEDGEHOG IS A BITCHASS MOTHERFUCKER, also, my name is: " + name + " " + lastname;

    }

    @GetMapping("/concat/{name}/{lastname}")
    public String Concatenate(@PathVariable String name, @PathVariable String lastname) {
        return "whyyyyyyy this is the second proyect in spring boot, and this is my name: " + name + " " + lastname;
    }
}