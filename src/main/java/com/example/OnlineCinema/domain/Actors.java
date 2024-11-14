package com.example.OnlineCinema.domain;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Актёры")
public class Actors extends BaseEntity{

    private String surname;
    private String name;
    private String MiddleName;
    private Set<Film> films;

    public Actors(String surname, String name, String MiddleName){
        this.surname = surname;
        this.name = name;
        this.MiddleName = MiddleName;
    }

    public Actors(){}

    @Column(name = "Фамилия")
    public String getSurname(){return surname;}
    public void setSurname(String surname) { this.surname = surname;}

    @Column(name = "Имя")
    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    @Column(name = "Отчество")
    public String getMiddleName(){return MiddleName;}
    public void setMiddleName(String MiddleName){this.MiddleName = MiddleName;}

    @ManyToMany
    @JoinTable(
            name = "ФилмыАктёры",
            joinColumns = @JoinColumn(name = "id_actors"),
            inverseJoinColumns = @JoinColumn(name = "id_films")
    )
    public Set<Film> getFilms() {
        return films;
    }
    public void setFilms(Set<Film> films) {
        this.films = films;
    }
}
