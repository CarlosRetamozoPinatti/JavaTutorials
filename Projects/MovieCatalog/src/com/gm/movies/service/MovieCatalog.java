package com.gm.movies.service;

public interface MovieCatalog {
    String RESOURCE_NAME = "films.txt";

    void addFilm(String movieName);

    void listFilms();

    void searchFilm(String search);

    void startCatalog();
}
