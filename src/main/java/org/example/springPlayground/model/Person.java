package org.example.springPlayground.model;

import jakarta.persistence.*;

@Entity
@Table(name = "people")
public class Person {

    @Id
    @Column(name = "id_person")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "person_name")
    private String personName;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "movie_rating")
    private Movie movieRating;

    public Person(Long id, Movie movieRating) {
        this.id = id;
        this.movieRating = movieRating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movieRating;
    }

    public void setMovie(Movie movie) {
        this.movieRating = movie;
    }
}
