package com.tareq23.treatisestore.controller;

import com.tareq23.treatisestore.dto.LoginDTO;
import com.tareq23.treatisestore.dto.RegistrationDTO;
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
        RegistrationDTO customer = new RegistrationDTO();
        customer.setEmail("customer@example.com");
        model.addAttribute("customer", customer);
        return "auth/register";
    }
    @PostMapping("/register")
    public String postRegister(@Valid @RequestBody RegistrationDTO customer)
    {

        return "auth/register";
    }

    @GetMapping("/login")
    public String getLogin(Model model)
    {
        model.addAttribute("credential",new LoginDTO());

        return "auth/login";
    }

    @PostMapping("/login")
    public String postLogin(@Valid @RequestBody LoginDTO login)
    {
        return "auth/login";
    }
}
