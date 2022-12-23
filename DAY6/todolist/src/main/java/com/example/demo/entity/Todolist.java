package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Table
@Data
public class Todolist {
    private int id;

    private String title;

    private String description;

    private Date date;

    private boolean status;

    public Todolist() {
    }
    public Todolist(int id, String title, String description) {
        this.setTitle(title);
        this.setDescription(description);
        this.setStatus(false);
        this.setDate(new Date());
    }
}
