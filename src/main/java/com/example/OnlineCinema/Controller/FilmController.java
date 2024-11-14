package com.example.OnlineCinema.Controller;

import com.example.OnlineCinema.dto.FilmDTO;
import com.example.OnlineCinema.dto.UserDTO;
import com.example.OnlineCinema.service.FilmService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/films")
public class FilmController {
    private final FilmService filmService;
    private final ModelMapper modelMapper;

    @Autowired
    public FilmController(FilmService filmService, ModelMapper modelMapper) {
        this.filmService = filmService;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public List<FilmDTO> getAllFilms() {
        return filmService.getAllFilms().stream()
                .map(film -> modelMapper.map(film, FilmDTO.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public FilmDTO getFilmById(@PathVariable int id){
        return modelMapper.map(filmService.getFilmById(id), FilmDTO.class);
    }
}
