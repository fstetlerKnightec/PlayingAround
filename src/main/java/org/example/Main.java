package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Main main = new Main();
        String getAllMovies = "select * from freddsdb.movies";
        String url = "jdbc:mysql://localhost:3306/freddsdb";
        String username = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url, username, password);
//        String addLaLaLand = main.addMovie("freddsdb.movies", 3, "'La La Land'", 10.0);
//        PreparedStatement insertStatement = con.prepareStatement(addLaLaLand);
//        insertStatement.executeUpdate();
//        System.out.println("Object inserted successfully.");

      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(getAllMovies);
      while (rs.next()) {
          String name = rs.getString(2);
          System.out.println(name);
      }

      con.close();

    }



    public String addMovie(String movieDB, int id, String movieName, double movieRating) {
        return "insert into " + movieDB + " values (" + id + ", " + movieName + ", " + movieRating + ");";
    }
}