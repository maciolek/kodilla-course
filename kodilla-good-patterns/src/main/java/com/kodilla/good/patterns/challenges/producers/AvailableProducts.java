package com.kodilla.good.patterns.challenges.producers;

import java.util.ArrayList;
import java.util.List;

public class AvailableProducts {

    private List<Product> listOfProduct = new ArrayList<Product>();

    public boolean addProduct(Product product) {
        if (listOfProduct.equals(product)) {
            System.out.println("Błąd, produkt już znajduje się na liście");
            return false;
        } else {
            listOfProduct.add(product);
            return true;
        }
    }

    public boolean removeProduct(Product product) {
        if (listOfProduct.equals(product)) {
            listOfProduct.remove(product);
            return true;
        } else {
            System.out.println("Błąd, produkt nie istnieje");
            return false;
        }
    }

    public List<Product> getListOfProduct() {
        return listOfProduct;
    }

    public boolean isAvailableProduct(Product product) {
        if (listOfProduct.get(listOfProduct.indexOf(product)).getQuantity() > 0) {
            return true;
        }
        System.out.println("Brak dostępnych produktów");
        return false;
    }

//    public int quantityOfProductOfAvailableList (Product product){
//        return listOfProduct.get(listOfProduct.indexOf(product)).getQuantity();
//    }

//    public boolean substructQuantityOfSoldProduct (Product product, int quantitySoldOfProduct) {
//        listOfProduct.get(listOfProduct.indexOf(product)).setQuantity(quantityOfProductOfAvailableList(product)-quantitySoldOfProduct);
//        return false;
//    }
}
