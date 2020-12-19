package ru.stroev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    //   /organization/horn_and_try
    @GetMapping("/menu")
    public String getMenu(){
        return "menuOrganization/menu";
    }
}
