package com.example.OnlineCinema.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Пользователь")
public class User extends BaseEntity {

    private String name;
    private String email;
    private String pasword;
    private Access access;

    public User(String name, String email, String pasword){
        this.email = email;
        this.name = name;
        this.pasword = pasword;
    }

    public User(){}

    @Column(name = "Имя")
    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    @Column(name = "Email")
    public String getEmail(){return email;}
    public void setEmail(String email) { this.email = email;}

    @Column(name = "Пароль")
    public String getPasword(){return pasword;}
    public void setPasword(String pasword){this.pasword = pasword;}

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_access", referencedColumnName = "id")
    public Access getAccess(){return access;}
    public void setAccess(Access access){this.access = access;}
}
