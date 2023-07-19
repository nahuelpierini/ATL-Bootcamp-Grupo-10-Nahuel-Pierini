package com.example.demo.test.repository;

import com.example.demo.test.models.Newsletter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsletterRepository extends JpaRepository<Newsletter,Integer> {
}
