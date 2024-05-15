package org.example.movieSpring.service;

import org.example.movieSpring.model.Movie;
import org.example.movieSpring.repo.MovieRepo;
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
        return movieRepo.findById(id);
    }

    public Movie addMovie(Movie movie) {
        return movieRepo.save(movie);
    }

    public Movie updateMovie(Movie movie) {
        Optional<Movie> newMovie = getMovieById(movie.getId());
        if (newMovie.isEmpty()) {
            throw new NullPointerException("Could not find object with that ID"); // Suggestion on better Exception?
        }
        newMovie.get().setTitle(movie.getTitle());
        newMovie.get().setRelease_year(movie.getRelease_year());
        return movieRepo.save(newMovie.get());
    }

    public void deleteMovie(Long id) {
        movieRepo.deleteById(id);
        System.out.println("Successfully deleted movie with ID " + id);
    }

}
