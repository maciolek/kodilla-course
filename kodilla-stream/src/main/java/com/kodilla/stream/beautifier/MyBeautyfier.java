package com.kodilla.stream.beautifier;

public class MyBeautyfier {

    public static String beautifierAddLineInHash(String someText) {

        String newText = ("\n######################################################################################" +
                "#################################\n " + "#################   " + someText + "   #################" +
        "\n######################################################################################" +
                "#################################\n");
        return newText;
    }

    public static String beautifierOneLineOneChar(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            newText = newText + "\n" + text.charAt(i);
        }
        return newText;
    }
}

