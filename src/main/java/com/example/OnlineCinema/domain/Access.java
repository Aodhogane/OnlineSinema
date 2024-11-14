package com.example.OnlineCinema.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Доступ")
public class Access extends BaseEntity {

    private String registered;
    private String notRegistered;

    public Access(String registered) {
        this.registered = registered;
    }

    public Access() {
    }

    @Column(name = "Доступ")
    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }
}