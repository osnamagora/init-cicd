package com.osnam.initcicd.controlleur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeControlleur {

    @GetMapping("/home/{country}")
    public String displayWelcome(@PathVariable String country) {
        return "Welcome to ".toUpperCase() + country.toUpperCase();
    }
}
