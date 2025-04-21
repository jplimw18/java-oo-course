package br.com.alura.screenmatch.Main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        Movie godfather = new Movie("Godfather", 1970);
        Movie avatar = new Movie("Avatar", 2016);

        Series gilmore = new Series("Gilmore girls", 2008);

        ArrayList<Title> list = new ArrayList<>();
        list.add(godfather);
        list.add(avatar);
        list.add(gilmore);

        for (Title title: list) {
            System.out.println(title.toString());
        }
    }
}
