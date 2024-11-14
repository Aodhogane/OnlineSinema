package com.example.OnlineCinema.repository;

import com.example.OnlineCinema.domain.User;
import java.util.List;


public interface UserRepository {
    void save(User user);
    User findById(int id);
}