package com.gm.movies.data;

import com.gm.movies.domain.Movie;
import com.gm.movies.exceptions.*;

import java.io.*;
import java.util.*;

public class DataAccessImp implements DataAccess{
    @Override
    public boolean exist(String resourceName)  {
        File file = new File(resourceName);
        file.exists();
        return file.exists();
    }

    @Override
    public List<Movie> listing(String resourceName) throws ReadingDataEx {
        var file = new File(resourceName);
        List<Movie> movies = new ArrayList<>();
        try {
            var input = new BufferedReader(new FileReader(file));
            String line = null;
            line = input.readLine();
            while (line != null){
                var movie = new Movie(line);
                movies.add(movie);
                line = input.readLine();
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new ReadingDataEx("Exception at movie listing: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new ReadingDataEx("Exception at movie listing: " + e.getMessage());
        }
        return movies;
    }

    @Override
    public void write(Movie movie, String resourceName, boolean add) throws WritingDataEx {
        var file = new File(resourceName);
        try {
            var exit = new PrintWriter(new FileWriter(file, add));
            exit.println(movie.toString());
            exit.close();
            System.out.println("Movies has been added: " + movie);
        } catch (IOException e) {
            e.printStackTrace();
            throw new WritingDataEx("Exception at movie listing: " + e.getMessage());
        }
    }

    @Override
    public String search(String resourceName, String search) throws ReadingDataEx {
        var file = new File(resourceName);
        String result = null;
        try {
            var input = new BufferedReader(new FileReader(file));
            String line = null;
            var index = 1;
            line = input.readLine();
            while (line != null){
                if(search != null && search.equalsIgnoreCase(line)){
                    result = "Film: " + line + " in index: " + index;
                    break;
                }
                line = input.readLine();
                index++;
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new ReadingDataEx("Exception at movie searching: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new ReadingDataEx("Exception at movie searching: " + e.getMessage());
        }
        return result;
    }

    @Override
    public void create(String resourceName) throws DataAccessEx {
        var file = new File(resourceName);
        try {
            var output = new PrintWriter(new FileWriter(file));
            output.close();
            System.out.println("File was created...");
        } catch (IOException e) {
            e.printStackTrace();
            throw new DataAccessEx("Exception at file creation " + e.getMessage());
        }
    }

    @Override
    public void delete(String resourceName) {
        var file = new File(resourceName);
        if (file.exists())
            file.delete();
        System.out.println("File was deleted...");
    }
}
