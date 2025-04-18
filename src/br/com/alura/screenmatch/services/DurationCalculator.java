package br.com.alura.screenmatch.services;
import br.com.alura.screenmatch.models.Title;

public class DurationCalculator {
    private int totalDuration;

    public int getTotalDuration() {
        return totalDuration;
    }

    public void addTitle(Title title) {
        totalDuration += title.getDurationInMinutes();
    }
}
