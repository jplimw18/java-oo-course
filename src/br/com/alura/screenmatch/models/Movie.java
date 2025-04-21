package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.interfaces.Classify;

public class Movie extends Title implements Classify {
    private String director;

    public String getDirector() {
        return  director;
    }

    public Movie(String title) {
        super(title);
    }

    public Movie(String title, int year) {
        super(title, year);
    }

    public Movie(String title, int year, String description) {
        super(title, year, description);
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassify() {
        return (int)getAverageRate() / 2;
    }
}
