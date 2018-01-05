package com.kodilla.stream;

import com.kodilla.stream.beautifier.MyBeautyfier;
import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("\nNauka JAVA to sama przyjemność! :-D",String::toUpperCase);
        poemBeautifier.beautify("Nauka JAVY zajmuje mnóstwo czasu!", (text) -> MyBeautyfier.beautifierAddLineInHash(text));
        poemBeautifier.beautify("Umiem coraz wiecej", (text) -> MyBeautyfier.beautifierOneLineOneChar(text));

    }
}