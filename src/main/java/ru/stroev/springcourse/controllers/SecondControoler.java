package ru.stroev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondControoler {

    @GetMapping("/exit")
    public String exit(){
        return "second/exit";
    }
}
