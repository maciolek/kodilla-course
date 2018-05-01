package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {

    private String[][] workers = {
            {"67121215789", "Jan", "Kowalski"},
            {"82050515456", "Dariusz", "Żak"},
            {"75030315789", "Andrzej", "Wojciechowski"},
            {"80082312132", "Anna", "Buczko"},
            {"90123145795", "Ewa", "Hajduk"}};

    private double[] salaries = {
            4500.00,
            5000.00,
            7500.00,
            8000.00,
            6200.00};


    public String getWorker(int n) {
        if (n > workers.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalary() {
        return salaries;
    }
}



