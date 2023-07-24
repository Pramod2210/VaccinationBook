package com.vaccination.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaccination.demo.Model.user;

@Repository
public interface demorepo extends JpaRepository<user, Integer>{
    
}
