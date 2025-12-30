package com.week2.java.eight;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie>{

    private String name;
    private double rating;
    private int year;

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public int compareTo(Movie y) {
        return this.year - y.year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }
}


public class ComparableSorting{
    public static void main(String[] args) {
        ArrayList<Movie> movie = new ArrayList<>();
        movie.add(new Movie("DDLJ", 8.2, 1991));
        movie.add(new Movie("Krish", 7.0, 2010));
        movie.add(new Movie("RR", 8.0, 2025));
        movie.add(new Movie("Joker", 6.5, 1887));
        System.out.println("Before Sort -> "+ movie);

        Collections.sort(movie);
        System.out.println("After Sort -> " );
        for(Movie m :movie) {
            System.out.println( m.getName() +" " + m.getRating() + " " + m.getYear());
        }
    }
}
