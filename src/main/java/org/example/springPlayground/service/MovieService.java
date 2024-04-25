package org.example.springPlayground.service;

import org.example.springPlayground.model.Movie;
import org.example.springPlayground.repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepo movieRepo;

    @Autowired
    public MovieService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    public List<Movie> getMovies() {
        return movieRepo.findAll();
    }

    public Optional<Movie> getMovieById(Long id) {
        return movieRepo.findMovieById(id);
    }

    public Movie addMovie(Movie movie) {
        return movieRepo.save(movie);
    }
}
