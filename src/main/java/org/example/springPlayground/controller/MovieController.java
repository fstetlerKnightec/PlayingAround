package org.example.springPlayground.controller;

import org.example.springPlayground.model.Movie;
import org.example.springPlayground.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/getMovies")
    public List<Movie> getMovies() {
        return movieService.getMovies();
    }

    @GetMapping("/getMovie/{id}")
    public Optional<Movie> getMovie(@PathVariable(value = "id") Long id) {
        return movieService.getMovieById(id);
    }

    @PostMapping("/addMovie")
    public Movie addMovie(Movie movie) {
        return movieService.addMovie(movie);
    }
}
