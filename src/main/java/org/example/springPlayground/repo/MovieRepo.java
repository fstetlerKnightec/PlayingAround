package org.example.springPlayground.repo;

import org.example.springPlayground.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
@RestController
public class MovieRepo {

    @Autowired
    private JdbcTemplate template;

    @PostMapping("api/post")
    public void save(Movie movie) {
        String sql = "insert into movies (id_movie, movie_name, movie_rating) values (?, ?, ?)";



        int rows = template.update(sql, movie.getId(), movie.getName(), movie.getRating());
        System.out.println(rows + " row/s affected");
    }

    @GetMapping("api/getAll")
    public List<Movie> findAll() {

        String sql = "select * from movies";

        RowMapper<Movie> mapper = (rs, rowNum) -> {
            Movie m = new Movie();
            m.setId(rs.getInt(1));
            m.setName(rs.getString(2));
            m.setRating(rs.getDouble(3));

            return m;
        };

        return template.query(sql, mapper);
    }
}
