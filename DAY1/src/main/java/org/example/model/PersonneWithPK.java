package org.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Entity
@IdClass(PersonnePK.class)
public class PersonneWithPK implements Serializable {

    private String prenom;

    private String nom;

    private  static final long serialVersionUID = 1L;

    // Auto generate empty constructor
    public PersonneWithPK() {
        super();
    }

    //Auto generate getter and setter
    @Id
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    @Id
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Auto generate toString

    @Override
    public String toString() {
        return "PersonneWithPK{" +
                "prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
