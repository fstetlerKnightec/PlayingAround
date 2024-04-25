package org.example.springPlayground.controller;


import org.example.springPlayground.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class MovieController {

    @GetMapping("/getMovies")
    public List<Movie> getMovies() {
        return List.of(new Movie(1, "James Bond", 6.1));
    }
}
