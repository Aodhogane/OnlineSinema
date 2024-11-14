package com.example.OnlineCinema.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Жанры")
public class Genres extends BaseEntity{
    private String genres;
    private Set<Film> film;

    public  Genres(String genres){
        this.genres = genres;
    }

    public Genres(){}

    @Column(name = "Название")
    public String getGenres(){
        return genres;
    }
    public void setGenres(String genres){
        this.genres = genres;
    }

    @ManyToMany
    @JoinTable(
            name = "ФильмЖанр",
            joinColumns = @JoinColumn(name = "genre_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id")
    )
    public Set<Film> getFilms() {return film;}
    public void setFilms(Set<Film> films) {this.film = film;}
}
