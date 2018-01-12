package com.kodilla.good.patterns.challenges.producers;

import java.time.LocalDate;

public class MailInformation implements SaleInformation {

    @Override
    public void inform(User user, Product product, LocalDate dateOfSale) {

        System.out.println("Użytkowniku " + user.getName() + " " + user.getSurname()
                + " twoje zamówienie jest w trakcie kompletowania");
        System.out.println("Zamówione produkty: " + product.getNameOfProduct() + " cena: " + product.getPrice() + "zł");
        System.out.println("Adres do wysyłki: " + user.getAdress());
        System.out.println("Wiadomość została wygenerowana automatycznie na adres: " + user.getEmail());
        System.out.println("Data zamówienia " + dateOfSale);
    }
}
