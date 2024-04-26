package com.tareq23.treatisestore.controller;


import com.tareq23.treatisestore.dto.EmployeeDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/list")
    public String employeeList(Model model)
    {
        model.addAttribute("employees", List.of(
                new EmployeeDto("Abdullah", "Junior Developer", "01721111111"),
                new EmployeeDto("Harun", "Senior Developer", "01721111111"),
                new EmployeeDto("Hreadoy", "Software Architect", "01721111111")
        ));
        model.addAttribute("message", "Welcome to employee list page");
        return "employee";
    }

}
