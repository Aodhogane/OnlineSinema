package com.example.OnlineCinema.dto;

public class ReviewsDTO {
    private String comment;
    private int estimation;
    private Integer userId;
    private Integer filmId;

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }

    public int getEstimation() { return estimation; }
    public void setEstimation(int estimation) { this.estimation = estimation; }

    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }

    public Integer getFilmId() { return filmId; }
    public void setFilmId(Integer filmId) { this.filmId = filmId; }
}
