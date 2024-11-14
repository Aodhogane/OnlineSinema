package com.example.OnlineCinema.dto;

import java.util.Set;

public class FilmDTO {
    private String title;
    private String exitData;
    private String dureation;
    private Set<Integer> genre;
    private Set<Integer> actor;

    public String getTitle(){return title;}
    public void setTitle(String title){this.title=title;}

    public String getExitData(){return exitData;}
    public void setExitData(String exitData){this.exitData = exitData;}

    public String getDureation(){return dureation;}
    public void setDureation(String dureation){this.dureation = dureation;}

    public Set<Integer> getGenre(){return genre;}
    public void setGenre(Set<Integer> genre){this.genre = genre;}

    public Set<Integer> getActor(){return actor;}
    public void setActor(Set<Integer> actor){this.actor = actor;}
}
