package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MegaController {

    @GetMapping("/next")
    public String b1() {
        return "about";
    }
}
