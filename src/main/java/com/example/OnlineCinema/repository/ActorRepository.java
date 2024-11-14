package com.example.OnlineCinema.repository;

import com.example.OnlineCinema.domain.Actors;


import java.util.List;

public interface ActorRepository {
    void save(Actors actors);
    Actors findById(int id);
    List<Actors> findAll();
}
