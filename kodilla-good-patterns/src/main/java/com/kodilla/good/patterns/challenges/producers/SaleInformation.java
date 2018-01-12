package com.kodilla.good.patterns.challenges.producers;

import java.time.LocalDate;

public interface SaleInformation {

    void inform (User user, Product product, LocalDate dateOfSale);
}
