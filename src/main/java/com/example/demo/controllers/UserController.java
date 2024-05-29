package com.example.demo.controllers;

import com.example.demo.models.UserModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("get-first-name")
    public String getFirstName(){
        return "Miljan";
    }

    @GetMapping("get-first-name-list")
    public List<String> getFirstNameList(){
        return List.of("Miljan", "Miljana");
    }

    @PostMapping("create-user")
    public boolean createUser(String firstName, String lastName){
        return true;
    }

    @PostMapping("create-user-body")
    public boolean createUserBody(@RequestBody UserModel userModel){
        return true;
    }
}
