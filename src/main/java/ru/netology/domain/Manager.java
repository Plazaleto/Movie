package ru.netology.domain;

public class Manager {

    private int quantityOfAddedMovies = 10;
    private String[] movies = new String[0];

    public void addMovies(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Manager(int quantityOfAddedMovies) {
        this.quantityOfAddedMovies = quantityOfAddedMovies;

    }

    public Manager() {
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < quantityOfAddedMovies) {
            resultLength = movies.length;
        } else {
            resultLength = quantityOfAddedMovies;
        }
        String[] newList = new String[resultLength];
        for (int i = 0; i < newList.length; i++) {
            newList[i] = movies[movies.length - i - 1];
        }
        return newList;
    }


}