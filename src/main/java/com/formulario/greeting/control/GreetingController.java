package com.formulario.greeting.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.formulario.greeting.model.GreetingModel;
import org.springframework.ui.Model;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model){
        model.addAttribute("greeting", new GreetingModel());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute GreetingModel greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }
}
