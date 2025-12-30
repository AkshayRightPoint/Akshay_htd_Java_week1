package com.week2.java.eight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movies{
    private String name;
    private double rating;
    private int year;

    public Movies(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
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
}

class Rating implements Comparator<Movies>{

    @Override
    public int compare(Movies m1, Movies m2) {
        return Double.compare(m2.getRating() , m1.getRating());
    }
}

public class ComparatorSorting {
    public static void main(String[] args) {
        ArrayList<Movies> movie = new ArrayList<>();
        movie.add(new Movies("DDLJ", 8.2, 1991));
        movie.add(new Movies("Krish", 7.0, 2010));
        movie.add(new Movies("RR", 8.0, 2025));
        movie.add(new Movies("Joker", 6.5, 1887));
        System.out.println("Before Sort -> "+ movie);

        Collections.sort(movie, new Rating());
        System.out.println("Movies sorted by rating:");
        for (Movies m1 : movie) {
            System.out.println(m1.getName() + " " + m1.getRating() + " " + m1.getYear());
        }
    }
}
