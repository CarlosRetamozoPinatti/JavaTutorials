package com.gm.movies.data;

import com.gm.movies.domain.Movie;
import com.gm.movies.exceptions.*;

import java.util.List;

public interface DataAccess {
    boolean exist(String resourceName) throws DataAccessEx;

    List<Movie> listing(String resourceName) throws ReadingDataEx;

    void write(Movie movie, String resourceName, boolean add) throws WritingDataEx;

    String search(String resourceName, String search) throws ReadingDataEx;

    void create(String resourceName) throws DataAccessEx;

    void delete(String resourceName) throws DataAccessEx;
}
