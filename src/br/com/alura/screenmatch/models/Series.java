package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.interfaces.Classify;

public class Series extends Title  implements Classify {
    private int seasons;
    private int episodesPerSeason;
    private boolean active;
    private int minutesPerEpisode;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * episodesPerSeason * minutesPerEpisode;
    }

    public void setDurationInMinutes() {
        int duration = seasons * episodesPerSeason * minutesPerEpisode;
        super.setDurationInMinutes(duration);
    }

    @Override
    public int getClassify() {
        return (int)getAverageRate() / 2;
    }
}
