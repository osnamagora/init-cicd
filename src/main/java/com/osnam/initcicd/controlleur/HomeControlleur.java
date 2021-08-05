package com.osnam.initcicd.controlleur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home/{country}")
public class HomeControlleur {

    @GetMapping("/")
    public String displayWelcome(@PathVariable String country) {
        return "Welcome to ".toUpperCase() + country.toUpperCase();
    }

    @GetMapping("/{name}")
    public String displayWelcomeUser(@PathVariable String country, @PathVariable String name) {
        final String message =  "Welcome " + name + " to "+ country;
        return message.toUpperCase();
    }
}
