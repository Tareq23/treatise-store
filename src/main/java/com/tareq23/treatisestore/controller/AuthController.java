package com.tareq23.treatisestore.controller;

import com.tareq23.treatisestore.dto.CustomerDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/register")
    public String getRegister(Model model)
    {
        CustomerDTO customer = new CustomerDTO();
        customer.setEmail("customer@example.com");
        model.addAttribute("customer", customer);
        return "auth/register";
    }
    @PostMapping("/register")
    public String postRegister(@Valid @RequestBody CustomerDTO customer)
    {

        return "auth/register";
    }

    @PostMapping("/login")
    public String postLogin(@Valid @RequestBody CustomerDTO customer)
    {

        return "auth/login";
    }
}