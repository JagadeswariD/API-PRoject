package com.example.thymeleafformdemo;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class RegisterController {
	 @GetMapping("/register")
	    public String registerForm(Model model) {

	        model.addAttribute("user", new User());
	        return "Registration";
	    }

	    @PostMapping("/user-registration")
	    public String saveRegisterSubmission(Model model, @Valid User user, BindingResult result) {
	    	if (result.hasErrors()) {
	            return "Registration";
	        }
	    	model.addAttribute("ee", user);
	        return "registration-result";
	    }
}
