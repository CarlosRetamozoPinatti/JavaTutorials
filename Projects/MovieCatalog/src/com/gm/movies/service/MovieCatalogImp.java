package com.gm.movies.service;

import com.gm.movies.data.DataAccess;
import com.gm.movies.data.DataAccessImp;
import com.gm.movies.domain.Movie;
import com.gm.movies.exceptions.DataAccessEx;
import com.gm.movies.exceptions.ReadingDataEx;

public class MovieCatalogImp implements MovieCatalog{

    private final DataAccess data;

    public MovieCatalogImp() {
        this.data = new DataAccessImp();
    }


    @Override
    public void addFilm(String movieName) {
        Movie movie = new Movie(movieName);
        boolean addInfo = false;
        try {
            addInfo = data.exist(RESOURCE_NAME);
            data.write(movie, RESOURCE_NAME, addInfo);
        } catch (DataAccessEx e) {
            System.out.println("Data access error..");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void listFilms() {
        try {
            var movies = this.data.listing(RESOURCE_NAME);
            for (var movie: movies){
                System.out.println("Film: " + movie);
            }
        } catch (ReadingDataEx e) {
            System.out.println("Data access error...");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void searchFilm(String search) {
        String result = null;
        try {
            result = this.data.search(RESOURCE_NAME, search);
        } catch (ReadingDataEx e) {
            System.out.println("Data read error...");
            e.printStackTrace(System.out);
        }
        System.out.println("result: " + result);

    }

    @Override
    public void startCatalog() {
        try {
            if (this.data.exist(RESOURCE_NAME)){
                data.delete(RESOURCE_NAME);
                data.create(RESOURCE_NAME);
            }
            else {
                data.create(RESOURCE_NAME);
            }
        } catch (DataAccessEx e) {
            System.out.println("Data access error..");
            e.printStackTrace();
        }
    }
}
