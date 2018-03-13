package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/songform")
    public  String loadFormPage(Model model){
        Song s  = new Song();
        model.addAttribute("song", s);
        return "songform";
    }

    @PostMapping("/songform")
    public String loadFromPage(@ModelAttribute Song song, Model model){
        model.addAttribute("song" , song);
        return "confirmsong";
    }
}
