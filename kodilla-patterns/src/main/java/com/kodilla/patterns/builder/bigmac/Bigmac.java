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

        public static final String ROLL_WITH_SESAME = "ROLL_WITH_SESAME";
        public static final String STANDARD_ROLL = "STANDARD_ROLL";
        public static final String WITHOUT_SAUCE = "WITHOUT_SAUCE";
        public static final String ONE_THOUSAND_ISLANDS_DRESSING = "1000_ISLANDS_DRESSING";
        public static final String STANDARD_SAUCE = "STANDARD_SAUCE";
        public static final String LETTUCE = "LETTUCE";
        public static final String ONION = "ONION";
        public static final String BACON = "BACON";
        public static final String CUCUMBER = "CUCUMBER";
        public static final String CHILI = "CHILI";
        public static final String MUSHROOMS = "MUSHROOMS";
        public static final String STRIPS = "STRIPS";
        public static final String CHEESE = "CHEESE";

        private List<String> availableSauces = Arrays.asList(WITHOUT_SAUCE, ONE_THOUSAND_ISLANDS_DRESSING, STANDARD_SAUCE);
        private List<String> availableIngredients = Arrays.asList(LETTUCE, ONION, BACON,
                CUCUMBER, CHILI, MUSHROOMS, STRIPS, CHEESE);

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
            if (!roll.equals(ROLL_WITH_SESAME) && !roll.equals(STANDARD_ROLL)) {
                throw new IllegalStateException("You choose wrong roll ");
            }
            if (burgers < 1 || burgers > 3) {
                throw new IllegalStateException("You should change numbers of burgers: " + burgers);
            }
            if (!availableSauces.contains(sauce)) {
                throw new IllegalStateException("Chosen sauce doesn't exist: " + sauce);
            }
            for (String currnetIngredient : ingredients) {
                if (!availableIngredients.contains(currnetIngredient)) {
                    throw new IllegalStateException("Chosen ingredients doesn't exist " + currnetIngredient);
                }
            }
            return new Bigmac(roll, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final String roll, final int burgers, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

}
