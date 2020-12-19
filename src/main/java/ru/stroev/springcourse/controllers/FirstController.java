package ru.stroev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/organization")
public class FirstController {

    //   /organization/horn_and_try
    @GetMapping("/horn_and_try")
    public String getHornAndTry(){
        return "company/companyOne";
    }
    //   /organization/wine_glass
    @GetMapping("/wine_glass")
    public String getWineGlass(){
        return "company/companyTwo";
    }
}
