package com.example.android_td5;

public class Contact {
    String nom;
    String prenom;
    String imageUrl;

    public Contact(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Contact(String nom, String prenom, String imageUrl) {
        this.nom = nom;
        this.prenom = prenom;
        this.imageUrl = imageUrl;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
