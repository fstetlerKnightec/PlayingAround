package org.example.springPlayground;

import org.example.springPlayground.model.Movie;
import org.example.springPlayground.repo.MovieRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class OtherMain {


    public static void main(String[] args) {

        SpringApplication.run(OtherMain.class, args);



//        ApplicationContext context = SpringApplication.run(OtherMain.class, args);
//
//        Movie movie = context.getBean(Movie.class);
//        int id = 0;
//        movie.setId(id++);
//        movie.setName("Jason Bourne");
//        movie.setRating(8.0);
//
//        MovieRepo repo = context.getBean(MovieRepo.class);
//        repo.save(movie);
//
//        System.out.println(repo.findAll());

    }


}
