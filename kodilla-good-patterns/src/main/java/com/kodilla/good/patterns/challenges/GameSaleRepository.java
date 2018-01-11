package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class GameSaleRepository implements SalesRepository {

    @Override
    public void createSaleProduct(User user, Product product, LocalDate dateOfSale) {
        System.out.println("Zapisanie do bazy danych sprzedaży " + product.getNameOfProduct() + " użytkownikowi " + user.getUserName()
                + " po cenie " + product.getPriceOfProduct() + " w dniu " + dateOfSale.toString());
        System.out.println("Email do kontaktu: " + user.getEmail());
    }
}
