package com.example.OnlineCinema.domain;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "Билеты")
public class Tickets extends BaseEntity {

    private LocalDateTime time;
    private int place;
    private User user;
    private Film film;

    public Tickets(LocalDateTime time, int place){
        this.place = place;
        this.time = time;
    }

    public Tickets(){}

    @Column(name = "Время")
    public LocalDateTime getTime() {
        return time;
    }
    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Column(name = "Место")
    public int getPlace() {
        return place;
    }
    public void setPlace(int place) {
        this.place = place;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_films", referencedColumnName = "id")
    public Film getFilm() {return film;}
    public void setFilm(Film film){this.film = film;}

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    public User getUser(){return user;}
    public void setUser(User user){this.user = user;}
}
