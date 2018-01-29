package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public final static String DRIVING_TASK = "DRIVINGTASK";
    public final static String SHOPPING_TASK = "SHOPPINGTASK";
    public final static String PAINTING_TASK = "PAINTNGTASK";


    public final Task generateTask(final String newTask) {

        switch (newTask) {
            case DRIVING_TASK:
                return new DrivingTask("Wyjazd", "Kraków", "AUDI A6");
            case SHOPPING_TASK:
                return new ShoppingTask("Zakupy spożywcze", "mleko", 2.5);
            case PAINTING_TASK:
                return new PaintingTask("Malowanie", "niebieski", "sciany sypialni");
            default:
                throw new IllegalArgumentException("Choosen name of task is wrong!");
        }
    }
}
