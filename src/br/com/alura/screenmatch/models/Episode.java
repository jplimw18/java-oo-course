package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.interfaces.Classify;

public class Episode implements Classify {
    private int number;
    private String title;
    private int totalViews;
    private Series serie;

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int getClassify() {
        return totalViews > 100 ? 4 : 2;
    }
}
