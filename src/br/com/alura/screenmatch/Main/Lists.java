package br.com.alura.screenmatch.Main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        Movie godfather = new Movie("Godfather", 1970);
        godfather.rate(10);

        Movie avatar = new Movie("Avatar", 2016);
        avatar.rate(5);

        Series gilmore = new Series("Gilmore girls", 2008);
        gilmore.rate(6);


        List<Title> list = new LinkedList<>();
        list.add(godfather);
        list.add(avatar);
        list.add(gilmore);

        list.forEach(System.out::println);

        for (Title title: list) {
            System.out.println(title.toString());
            if (title instanceof Movie) {
                System.out.println("filme");
            }
            else if (title instanceof Series) {
                System.out.println("série");
            }
            else {
                System.out.println("falha ao identificar.");
            }
        }

        ArrayList<String> artistas = new ArrayList<>();
        artistas.add("Fabaiana");
        artistas.add("Luanete");
        artistas.add("João belo");

        Collections.sort(artistas);

        list.sort(Comparator.comparing(Title::getYear));
        System.out.println(list);
    }
}
