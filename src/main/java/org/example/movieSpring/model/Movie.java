package org.example.movieSpring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @Column(name = "id_movie")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "movie_title")
    private String title;

    @Column(name = "movie_release_year")
    private int release_year;

    public Movie(Long id, String title, int release_year) {
        this.id = id;
        this.title = title;
        this.release_year = release_year;
    }
}
