package main.java.kz.kaznitu.lesson.controllers;

import kz.kaznitu.lesson.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private AdminRepository adminRepository;

    @RequestMapping(path = "/")
    public String home(){
        return "home";
    }
}
