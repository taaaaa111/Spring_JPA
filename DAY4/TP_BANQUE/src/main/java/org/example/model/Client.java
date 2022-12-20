package org.example.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cname;
    private String cprenom;
    private Date cbirthdate;
    @ManyToMany
    @JoinTable(name= "client_compte",
    JoinColumns = @JoinColumn(name="client_id"),
        inverseJoinColumns = @JoinColumn(name = "compte_id")
    )
    private List<Compte> comptes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCprenom() {
        return cprenom;
    }

    public void setCprenom(String cprenom) {
        this.cprenom = cprenom;
    }

    public Date getCbirthdate() {
        return cbirthdate;
    }

    public void setCbirthdate(Date cbirthdate) {
        this.cbirthdate = cbirthdate;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }
}
