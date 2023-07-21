package com.atl.newsletter.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class NewsletterRepository {


    @PersistenceContext
    private EntityManager dataBase;


    @Transactional
    public void saveEmail(String userEmail){
        String sqlQuery = "INSERT INTO Newsletter (email) VALUES (:paramEmail)";
        dataBase.createQuery(sqlQuery).setParameter("paramEmail",userEmail).executeUpdate();
    }

    @Transactional
    public void deleteEmail(String userEmail){
        String sqlQuery = "DELETE FROM Newsletter WHERE email = :paramEmail";
        dataBase.createQuery(sqlQuery).setParameter("paramEmail",userEmail).executeUpdate();
    }

    @Transactional
    public List<String> findAll(){
        String sqlQuery = "SELECT email FROM Newsletter";
        return dataBase.createQuery(sqlQuery).getResultList();

    }

}
