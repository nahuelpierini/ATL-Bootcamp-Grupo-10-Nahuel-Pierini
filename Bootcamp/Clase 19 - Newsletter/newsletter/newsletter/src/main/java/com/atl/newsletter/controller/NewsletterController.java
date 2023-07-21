package com.atl.newsletter.controller;

import com.atl.newsletter.entity.Newsletter;
import com.atl.newsletter.repository.NewsletterRepository;
import com.atl.newsletter.validators.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsletterController {

    @Autowired
    private NewsletterRepository newsletterRepository;


    @GetMapping("/api/newsletter")
    public List<String> getAllEmail(){
        return newsletterRepository.findAll();
    }

    @PostMapping("/api/newsletter")
    public String register(@RequestBody Newsletter newsletter){
        EmailValidator emailValidator = new EmailValidator();
        String email = newsletter.getEmail();

        if (emailValidator.isValid(email)){
        newsletterRepository.saveEmail(email);
        return "Email: " + newsletter.getEmail() + " has been successfully registered";
        }
        return "The email couldn´t been registered because it doesn't match the requirement allowed";
    }

    @DeleteMapping("/api/newsletter")
    public String unsubscribe(@RequestBody Newsletter newsletter){
        String email = newsletter.getEmail();
        newsletterRepository.deleteEmail(email);
        return "Email: " + newsletter.getEmail() + " has been unsubscribed";
    }
}
