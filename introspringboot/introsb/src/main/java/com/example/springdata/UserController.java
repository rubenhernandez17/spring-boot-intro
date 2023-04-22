package com.example.springdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
 
    @Autowired
    private UserService userService;
 
    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        com.example.springdata.User newUser = new com.example.springdata.User(user.getId(), user.getName(), user.getEmail());
        userService.saveUser(newUser);
        return "redirect:/success.html";
    }
}
