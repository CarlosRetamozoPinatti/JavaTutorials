package com.gm.movies.views;

import com.gm.movies.service.MovieCatalog;
import com.gm.movies.service.MovieCatalogImp;

import java.util.Scanner;

public class CatalogPresentation {
    public static void main(String[] args) {
        var option = -1;
        var scanner = new Scanner(System.in);
        MovieCatalog catalog = new MovieCatalogImp();


        while (option != 0){
            System.out.println("Choose an option: \n" +
                    "1. Start catalog\n" +
                    "2. Add Movie\n" +
                    "3. List all movies\n" +
                    "4. Find movie\n" +
                    "0. Exit");
            option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1:
                    catalog.startCatalog();
                    break;
                case 2:
                    System.out.println("Which movie do you want to add..?");
                    var movieName = scanner.nextLine();
                    catalog.addFilm(movieName);
                    break;
                case 3:
                    catalog.listFilms();
                    break;
                case 4:
                    System.out.println("search for...?");
                    var search = scanner.nextLine();
                    catalog.searchFilm(search);
                    break;
                case 0:
                    System.out.println("goodbye..");
                    break;
                default:
                    System.out.println("Wrong Option");
                    break;
            }

        }
    }
}
