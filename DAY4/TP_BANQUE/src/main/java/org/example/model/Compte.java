package org.example.model;

import javax.persistence.*;

@Entity
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long Id;

    @Column(nullable = false)
    private String Libelle;
    @Column(nullable = false, length = 27)

    private String IBAN;
    @Column(precision = 0, scale =2)
    private double Solde;

    @ManyToOne
    @JoinColumn(name = "id_name")
    private Agence agence; // le nom doit être identique à celui de mappedBy dans me model Agence.

    @ManyToMany(mappedBy = "comptes")
    @JoinColumn(name = "id_agence")
    private List<Client> clients;
}
