package com.tareq23.treatisestore.restapi;


import com.tareq23.treatisestore.dto.RegistrationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/author")
public class AuthorControllerApi {

    @GetMapping("/register")
    public String getRegister(Model model)
    {
        RegistrationDTO customer = new RegistrationDTO();
        customer.setEmail("customer@example.com");
        model.addAttribute("customer", customer);
        return "auth/register";
    }

}
