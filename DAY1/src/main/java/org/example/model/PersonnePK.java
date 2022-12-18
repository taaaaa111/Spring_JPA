package org.example.model;

import java.io.Serializable;
import java.util.Objects;

public class PersonnePK implements Serializable {

    private  static final long serialVersionUID = 1L;

    private String nom;

    private String prenom;

    // generate empty constructor
    public PersonnePK() {
    }

    public PersonnePK(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

   // equals

    public boolean equals(Object obj) {
        boolean resultat = false;
        if(obj == this) {
            resultat = true;
        }else {
            if(!(obj instanceof PersonnePK)){
                resultat = false;
            }else {
                PersonnePK autre =(PersonnePK) obj;
                if(!nom.equals(autre.nom)){
                    resultat = false;
                }else {
                    if(prenom != autre.prenom) {
                        resultat = false;
                    }else {
                        resultat = true;
                    }
                }
            }
        }
        return resultat;
    }
 // hash
    public int hashCode() {
        return (nom + prenom).hashCode();
    }
}
