package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    @RequestMapping("/login")
    public String    loginCheck(){

        return "hello";
    }

    @RequestMapping("/book")
    public String    selectBook(){

        return  "this is a book";
    }

    @RequestMapping("/movie")
    public String    movie(){

        return  "this is a movie";
    }

    @RequestMapping("/hello")
    public String    meet(){

        return  "this is a meet";
    }
}
