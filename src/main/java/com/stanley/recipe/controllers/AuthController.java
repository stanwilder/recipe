package com.stanley.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping("/login")
    Public String getLogin(){
        return"/login.html";
    }
}

// I got blocked here. I couldn't figure out why it was stopping me from the getMapping, but I couldn't start my page anymore. I followed along with the video
// and i honestly had fun but i don't know how to fix this issue.