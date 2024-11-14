package com.example.OnlineCinema.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Отзывы")
public class Reviews extends BaseEntity {
    private String comment;
    private int estimation;
    private User user;
    private Film film;

    public  Reviews(String comment, int estimation){
        this.comment = comment;
        this.estimation = estimation;
    }

    public Reviews(){}

    @Column(name = "Комментарий")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Column(name = "Оценка")
    public int getEstimation() {
        return estimation;
    }

    public void setEstimation(int estimation) {
        this.estimation = estimation;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "users_id", referencedColumnName = "id")
    public User getUser(){return user;}
    public void setUser(User user){this.user=user;}

    @ManyToOne(optional = false)
    @JoinColumn(name = "films_id", referencedColumnName = "id")
    public Film getFilm() {return film;}
    public void setFilm(Film film){this.film=film;}
}
