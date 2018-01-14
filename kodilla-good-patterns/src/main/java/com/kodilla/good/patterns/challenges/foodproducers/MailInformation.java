package com.kodilla.good.patterns.challenges.foodproducers;

import java.time.LocalDate;

public class MailInformation implements SaleInformation {

    @Override
    public void inform(Order order, boolean isSold) {
        if (isSold) {
            System.out.println("Użytkowniku " + order.getUser().getFirstName() + " " + order.getUser().getSurname()
                    + " twoje zamówienie jest w trakcie kompletowania");
            System.out.println("Zamówione produkty: " + order.getProduct().getName() + " cena: " + order.getProduct().getPrice() + "zł");
            System.out.println("Producent: " + order.getProduct().getNameOfProducer());
            System.out.println("Ilość: " + order.getVolumeOfPurchase());
            System.out.println("Adres do wysyłki: " + order.getUser().getAdress());
            System.out.println("Wiadomość została wygenerowana automatycznie na adres: " + order.getUser().getEmail());
            System.out.println("Data zamówienia " + order.getDateOfSale());
        } else {
            System.out.println("Użytkowniku " + order.getUser().getFirstName() + " " + order.getUser().getSurname()
                    + " twoje zamówienie nie zostanie zrealizowane.");
            System.out.println("Zamówione produkty: " + order.getProduct().getName() + " nie są aktualnie dostępne.");
        }
    }
}
