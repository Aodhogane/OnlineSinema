package com.example.OnlineCinema.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Режиссеры")
public class Directors extends BaseEntity{

    private String surname;
    private String name;
    private String MiddleName;
    private Set<Film> films;

    public Directors(String surname, String name, String MiddleName){
        this.surname = surname;
        this.name = name;
        this.MiddleName = MiddleName;
    }

    public Directors(){}

    @Column(name = "Фамилия")
    public String getSurname(){return surname;}
    public void setSurname(String surname) { this.surname = surname;}

    @Column(name = "Имя")
    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    @Column(name = "Отчество")
    public String getMiddleName(){return MiddleName;}
    public void setMiddleName(String MiddleName){this.MiddleName = MiddleName;}

    @ManyToMany(mappedBy = "directors")
    public Set<Film> getFilms() {return films;}
    public void setFilms(Set<Film> films) {this.films = films;}
}
