package com.example.OnlineCinema.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "Фильм")
public class Film extends BaseEntity {

    private String title;
    private LocalDateTime exitDate;
    private int duration;
    private Set<Actors> actors;
    private Set<Directors> directors;
    private Set<Genres> genres;

    public Film(String title, LocalDateTime exitDate, int duration, String film){
        this.title=title;
        this.exitDate=exitDate;
        this.duration=duration;
    }

    public Film(){}

    @Column(name = "Название")
    public String getTitle(){return title;}
    public void setTitle(String title){this.title = title;}

    @Column(name = "Дата выхода")
    public LocalDateTime getExitDate(){return exitDate;}
    public void setExitDate(LocalDateTime exitDate){this.exitDate = exitDate;}

    @Column(name = "Продолжительность")
    public int getDuration(){return duration;}
    public void setDuration(int duration){this.duration = duration;}

    @ManyToMany(mappedBy = "films")
    public Set<Actors> getActors(){return actors;}
    public void setActors(Set<Actors> actors){this.actors= actors;}

    @ManyToMany
    @JoinTable(
            name = "ФильмРежисёр",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "director_id")
    )
    public Set<Directors> getDirectors() {return directors;}
    public void setDirectors(Set<Directors> directors) {this.directors = directors;}

    @ManyToMany(mappedBy = "films")
    public Set<Genres> getGenres() {return genres;}
    public void setGenres(Set<Genres> genres) {this.genres = genres;}
}

