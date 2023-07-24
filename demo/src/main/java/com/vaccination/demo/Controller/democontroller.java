package com.vaccination.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vaccination.demo.Model.user;
import com.vaccination.demo.Servises.demoServises;

@Controller
public class democontroller {
    @Autowired
    demoServises ds;


    @GetMapping("/")
    public String home(){
        return "index";
    }

@PostMapping("/tabledata")
   public String welString(@ModelAttribute user u,Model m){
     ds.add(u);
        m.addAttribute("data",ds.show());
     return "table";
   }

    
}
