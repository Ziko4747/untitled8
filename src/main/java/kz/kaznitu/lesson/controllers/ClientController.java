package main.java.kz.kaznitu.lesson.controllers;

import  kz.kaznitu.lesson.models.Admin;
import kz.kaznitu.lesson.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path = "/main")
public class ClientController {
    @Autowired
    private AdminRepository adminRepository ;
    private long a;

    @GetMapping("/all2")
    public @ResponseBody Iterable<Admin> allclients(){
        return adminRepository.findAll() ;
    }

    @GetMapping("/all")
    public String allAuthors2(Model model){
        List<Admin> admins = (List<Admin>) adminRepository.findAll();
        model.addAttribute("clients", admins) ;
        return "clients" ;
    }

}
