package com.tareq23.treatisestore.controller;

import com.tareq23.treatisestore.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model)
    {
        model.addAttribute(new UserDto());
        return "index";
    }

}
