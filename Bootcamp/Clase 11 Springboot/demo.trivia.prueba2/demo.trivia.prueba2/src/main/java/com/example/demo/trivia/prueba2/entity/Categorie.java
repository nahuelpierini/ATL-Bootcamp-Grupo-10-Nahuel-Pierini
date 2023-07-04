package com.example.demo.trivia.prueba2.entity;

public class Categorie {
    private String category;
    private String descprition;

    public Categorie (){

    }

    public Categorie(String categorie, String descprition) {
        this.category = categorie;
        this.descprition = descprition;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescprition() {
        return descprition;
    }

    public void setDescprition(String descprition) {
        this.descprition = descprition;
    }
}
