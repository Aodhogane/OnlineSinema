package com.example.OnlineCinema.dto;

public class TicketsDTO {

    private String time;
    private int place;
    private Integer userId;
    private Integer filmId;

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    public int getPlace() { return place; }
    public void setPlace(int place) { this.place = place; }

    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }

    public Integer getFilmId() { return filmId; }
    public void setFilmId(Integer filmId) { this.filmId = filmId; }
}
