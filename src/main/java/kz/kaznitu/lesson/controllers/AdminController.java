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
@RequestMapping(path = "/demo")
public class AdminController {
    @Autowired
    private AdminRepository adminRepository ;
    private long a;

    @RequestMapping("/add")
    public String showForm(Model model){
        model.addAttribute("admin",new Admin());
        return "admin_add_form";
    }

    @RequestMapping("/addd")
    public String showFormm(Model model){
        model.addAttribute("adminn",new Admin());
        return "update";
    }
    @PostMapping("/add")
    public String addAdmins(@ModelAttribute Admin admin){
        adminRepository.save(admin) ;
        return "redirect:/demo/all" ;
    }


    @GetMapping("/all2")
    public @ResponseBody Iterable<Admin> allAdmins(){
        return adminRepository.findAll() ;
    }

    @GetMapping("/all")
    public String allAdmins2(Model model){
        List<Admin> admins = (List<Admin>) adminRepository.findAll();
        model.addAttribute("admins", admins) ;
        return "admins" ;
    }

    @PostMapping("/adds")
    public String addsAdmin(@ModelAttribute Admin admin){
        Admin admin1 = new Admin();
        admin1.setId(a);
        admin1.setName(admin.getName());
        admin1.setBaga(admin.getBaga());
        adminRepository.save(admin1) ;

        return "redirect:/demo/all" ;
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public ModelAndView updateAdmins(Model model,@RequestParam("id") long id){
        a=id;
        Optional<Admin> admin = (Optional <Admin> ) adminRepository.findById(id);
        model.addAttribute("adminn",admin);
        return new ModelAndView("update");
    }
    @RequestMapping(value = "/deleteContact",method = RequestMethod.GET)
    public ModelAndView deleteContact(@RequestParam("id") long idd){
        adminRepository.deleteById(idd);
        return new ModelAndView("redirect:/demo/all");
    }
}
