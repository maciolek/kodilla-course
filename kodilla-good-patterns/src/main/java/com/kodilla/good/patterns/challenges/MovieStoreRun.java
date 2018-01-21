package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreRun {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String titleList = movieStore.getMovies().entrySet().stream()
                .flatMap(t -> t.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.print(titleList);
    }
}
