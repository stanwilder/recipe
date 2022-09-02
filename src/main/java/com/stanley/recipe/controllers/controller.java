package com.stanley.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping("/")
    public String getHome() {
        return "indexPage";
    }
}
