package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {

    private final String roll;
    private final int burgers;
    private String sauce;
    private List<String> ingredients;

    public static class BuilderBigMac {

        public static final String ROLLWITHSESAME = "ROLLWITHSESAME";
        public static final String STANDARDROLL = "STANDARDROLL";
        private List<String> availableSauce = Arrays.asList("withoutSOUCE", "1000IslandsSouce", "Standard Souce");
        private List<String> availableIngredients = Arrays.asList("lettuce", "onion", "bacon",
                "cucumber", "chili", "mushrooms", "strips", "cheese");

        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BuilderBigMac roll(String roll) {
            this.roll = roll;
            return this;
        }

        public BuilderBigMac burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BuilderBigMac sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BuilderBigMac ingredients(String ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
//            if (!roll.equals(ROLLWITHSESAME) || !roll.equals(STANDARDROLL)) {
//                throw new IllegalStateException("You choose wrong roll " );
//            }
            if (burgers < 0 && burgers > 3) {
                throw new IllegalStateException("You should change numbers of burgers");
            }
            if (availableSauce.contains(sauce)) {
                throw new IllegalStateException("Chosen sauce doesn't exist -" + sauce);
            }
            for (String currnetIngredient : ingredients) {
                if (!availableIngredients.contains(currnetIngredient)) {
                    throw new IllegalStateException("Chosen ingredients doesn't exist " + currnetIngredient);
                }
            }
            return new Bigmac(roll, burgers, sauce, ingredients);
        }
    }

    private Bigmac(String roll, int burgers, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                "ilość składników" + ingredients.size() +
                '}';
    }
}
