package br.com.alura.screenmatch.Main;

import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Title;
import br.com.alura.screenmatch.services.DurationCalculator;
import br.com.alura.screenmatch.services.FilterRecommendation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Pulp Fiction");
        myMovie.setYear(1995);
        myMovie.setDurationInMinutes(154);

        myMovie.rate(10);
        myMovie.rate(8);
        myMovie.rate(5);

        Series sherlock = new Series("Sherlock Holmes");
        sherlock.setTitle("Sherlock Holmes");
        sherlock.setYear(2010);
        sherlock.setSeasons(4);
        sherlock.setEpisodesPerSeason(3);
        sherlock.setMinutesPerEpisode(90);
        sherlock.setDescription("A série \"Sherlock\" é uma versão moderna e atualizada das histórias de Sherlock Holmes, um detetive consultor que resolve crimes com a ajuda de seu amigo e colega de quarto, o Dr. John Watson. A dupla, interpretada por Benedict Cumberbatch e Martin Freeman, respectivamente, navega pelos desafios da Londres contemporânea, enfrentando crimes brutais e casos intrigantes. ");
        sherlock.rate(10);
        sherlock.rate(10);
        sherlock.rate(10);
        sherlock.displayBasicInfo();

        DurationCalculator calculator = new DurationCalculator();
        calculator.addTitle(sherlock);
        calculator.addTitle(myMovie);

        System.out.printf("Duração total: %d minuto(s)\n", calculator.getTotalDuration());


        FilterRecommendation filter = new FilterRecommendation();
        filter.filter(sherlock);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(sherlock);
        episode.setTotalViews(300);
        filter.filter(episode);

        ArrayList<Title> listMovie = new ArrayList<>();
        listMovie.add(myMovie);
        listMovie.add(sherlock);

        System.out.printf("Tamanho da lista: %d\n", listMovie.size());
        System.out.printf("Primeiro título: %s\n", listMovie.getFirst().getTitle());

        System.out.println(listMovie.getFirst().toString());
        System.out.println(listMovie.toString());
    }
}
