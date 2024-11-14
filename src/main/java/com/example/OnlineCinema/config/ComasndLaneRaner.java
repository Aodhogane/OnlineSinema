//package com.example.OnlineCinema.config;
//
//import com.example.OnlineCinema.domain.*;
//import com.example.OnlineCinema.repository.*;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.time.LocalDateTime;
//import java.util.Set;
//
//@Component
//public class ComasndLaneRaner implements CommandLineRunner {
//
//    private final FilmRepository filmRepository;
//    private final ReviewsRepository reviewsRepository;
//    private final TicketsRepository ticketsRepository;
//    private final UserRepository userRepository;
//    private final ActorRepository actorRepository;
//    private final DirectorRepository directorRepository;
//    private final GenreRepository genreRepository;
//    private final AccessRepository accessRepository;
//
//    public ComasndLaneRaner(FilmRepository filmRepository, ReviewsRepository reviewsRepository, TicketsRepository ticketsRepository,
//                            UserRepository userRepository, ActorRepository actorRepository, DirectorRepository directorRepository,
//                            GenreRepository genreRepository, AccessRepository accessRepository) {
//        this.filmRepository = filmRepository;
//        this.reviewsRepository = reviewsRepository;
//        this.ticketsRepository = ticketsRepository;
//        this.userRepository = userRepository;
//        this.actorRepository = actorRepository;
//        this.directorRepository = directorRepository;
//        this.genreRepository = genreRepository;
//        this.accessRepository = accessRepository;
//    }
//
//    @Override
//    @Transactional
//    public void run(String... args) {
//        // Создаем пользователя
//        User user = new User();
//        user.setName("Боб");
//        user.setEmail("test@example.com");
//        userRepository.save(user);
//
//        // Создаем актера
//        Actors actor = new Actors();
//        actor.setName("Леонардо ДиКаприо");
//        actorRepository.save(actor);
//
//        // Создаем режиссера
//        Directors director = new Directors();
//        director.setName("Кристофер Нолан");
//        directorRepository.save(director);
//
//        // Создаем жанр
//        Genres genre = new Genres();
//        genre.setGenres("Sci-Fi");
//        genreRepository.save(genre);
//
//        // Создаем доступ для пользователя
//        Access access = new Access();
//        access.setRegistered("Доступ");
//        accessRepository.save(access);
//
//        // Создаем фильм и связываем с актером, режиссером и жанром
//        Film film = new Film();
//        film.setTitle("Inception");
//        film.setExitDate(LocalDateTime.of(2010, 7, 16, 0, 0)); // Устанавливаем дату выхода
//        film.setDuration(148); // Устанавливаем продолжительность
//        film.setActors(Set.of(actor)); // Связываем актера с фильмом
//        film.setDirectors(Set.of(director)); // Связываем режиссера с фильмом
//        film.setGenres(Set.of(genre)); // Связываем жанр с фильмом
//        filmRepository.save(film);
//
//        // Создаем отзыв
//        Reviews review = new Reviews();
//        review.setFilm(film);
//        review.setUser(user);
//        review.setComment("Amazing movie with mind-bending plot twists!");
//        review.setEstimation(5);
//        reviewsRepository.save(review);
//
//        // Создаем билет
//        Tickets ticket = new Tickets();
//        ticket.setFilm(film);
//        ticket.setUser(user);
//        ticket.setPlace(1);
//        ticket.setTime(LocalDateTime.now().plusDays(1)); // Сеанс на следующий день
//        ticketsRepository.save(ticket);
//
//        System.out.println("Данные для пользователей, актеров, режиссеров, жанров, доступа, фильма, отзыва и билета успешно добавлены.");
//    }
//}
