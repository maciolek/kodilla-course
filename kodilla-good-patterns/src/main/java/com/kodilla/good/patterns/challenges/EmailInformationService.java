package com.kodilla.good.patterns.challenges;

import java.net.Socket;
import java.time.LocalDate;

public class EmailInformationService implements InformationService {

    public void inform(User user, Product product, LocalDate dateOfSale) {
        System.out.println("Dzień dobry, " + user.getName() + " " + user.getSurname()
                + " właśnie dokonałeś/aś zakupu produktu " + product.getNameOfProduct());
        System.out.println("Data zakupu: " + dateOfSale.toString());
        System.out.println("Cena zakupu: " + product.getPriceOfProduct()  + " zł");
    }
}
