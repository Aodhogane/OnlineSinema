package com.example.OnlineCinema.repository;

import com.example.OnlineCinema.domain.Tickets;

import java.util.List;

public interface TicketsRepository {
    void save(Tickets ticket);
    Tickets findById(int id);
    List<Tickets> findAll();
    void deleteById(int id);
}