package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.interfaces.Classify;

public class Movie extends Title implements Classify {
    private String director;

    public String getDirector() {
        return  director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassify() {
        return (int)getAverageRate() / 2;
    }
}
