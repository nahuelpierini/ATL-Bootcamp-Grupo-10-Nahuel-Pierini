package com.example.demo.test.controller;


import com.example.demo.test.models.Newsletter;
import com.example.demo.test.repository.NewsletterRepository;
import com.example.demo.test.validators.EmailValidator;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class NewsletterController {

    private NewsletterRepository newsletterRepository;

    public NewsletterController(NewsletterRepository newsletterRepository) {
        this.newsletterRepository = newsletterRepository;
    }

    @GetMapping("/api/newsletter")
    public List<Newsletter> getAll(){

        return newsletterRepository.findAll();
    }

    @GetMapping("/api/newsletter/{id}")
    public Optional<Newsletter> getNewsletter(@PathVariable Integer id){

        return newsletterRepository.findById(id);
    }


    @PostMapping("/api/newsletter")
    public String CreateNewsletter(@RequestBody Newsletter newsletter){
        EmailValidator emailValidator = new EmailValidator();
        if (emailValidator.esValido(newsletter.getEmail())) {
            newsletterRepository.save(newsletter);
            return "El email ha sido almacenado con exito";
        }
        return "El email no cumple con los requisitos";
    }

}




