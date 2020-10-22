package com.hxb.core.web.controller;

import com.hxb.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
   @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register(String username,String password){
              int number =   this.userService.register(username,password);
             if (number>0){
                 return "main";
             }
             return "register";
   }


}
