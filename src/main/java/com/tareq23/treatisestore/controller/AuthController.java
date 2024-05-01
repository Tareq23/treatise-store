package com.tareq23.treatisestore.controller;

import com.tareq23.treatisestore.dto.FormErrorDto;
import com.tareq23.treatisestore.dto.LoginDTO;
import com.tareq23.treatisestore.dto.RegistrationDTO;
import com.tareq23.treatisestore.service.AuthorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthorService authService;

    @GetMapping("/register")
    public String getRegister(Model model)
    {
        RegistrationDTO customer = new RegistrationDTO();
        customer.setEmail("customer@example.com");
        model.addAttribute("customer", customer);
        return "auth/register";
    }
    @PostMapping("/register")
    public String postRegister(@Valid @ModelAttribute RegistrationDTO customer, BindingResult bindingResult, Model model)
    {
        model.addAttribute("customer", customer);

        FormErrorDto result = new FormErrorDto();

        if(bindingResult.hasErrors()){
            Map<String, Object> errorMap = new HashMap<>();
            bindingResult.getFieldErrors().forEach(error -> {
                errorMap.put(error.getField(), error.getDefaultMessage());
            });
            result.setFields(errorMap);
            model.addAttribute("error", result);
            return "auth/register";

        }

        authService.register(customer);

        return "redirect:/";
    }

    @GetMapping("/login")
    public String getLogin(Model model)
    {
        model.addAttribute("credential",new LoginDTO());

        return "auth/login";
    }

    @PostMapping("/login")
    public String postLogin(@Valid @ModelAttribute LoginDTO credential, BindingResult bindingResult, Model model)
    {
        model.addAttribute("credential", credential);
        FormErrorDto result = new FormErrorDto();

        if(bindingResult.hasErrors()){
            result.setSuccess(false);
            result.setMessage("Please fill up required fields");
            System.out.println(bindingResult.getAllErrors());

            model.addAttribute("result", result);
            return "auth/login";
        }

        authService.login(credential);


        return "redirect:/";
    }
}
