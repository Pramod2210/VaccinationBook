package com.vaccination.demo.Servises;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaccination.demo.Model.user;
import com.vaccination.demo.Repository.demorepo;

@Service
public class demoServises {
    @Autowired
    demorepo repo;
    public Object add;

    public void add(user u){
        repo.save(u);
    }


    public List<user> show(){
        return repo.findAll();
      }
   
    
}
