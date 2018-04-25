package com.kodilla.patterns2.decorator.taxiportal.taxiportal;

import java.math.BigDecimal;

public interface TaxiOrder {

    BigDecimal getCost();

    String getDescription();

}
