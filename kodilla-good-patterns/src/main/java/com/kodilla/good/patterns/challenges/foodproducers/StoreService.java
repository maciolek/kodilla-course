package com.kodilla.good.patterns.challenges.foodproducers;

import java.util.*;

public class StoreService {

    private List<Product> listOfProducts = new ArrayList<Product>();

    public boolean addProduct(Product product) {
        if (listOfProducts.contains(product)) {
            System.out.println("Błąd, produkt tego producenta już znajduje się na liście.");
            return false;
        } else {
            listOfProducts.add(product);
            return true;
        }
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public boolean isAvailableProduct(Product product) {
        if (listOfProducts.contains(product)) {
        } else {
            return false;
        }
        return true;
    }

    public Product getProductFromListOfProducts(Product product) {
        return listOfProducts.get(listOfProducts.indexOf(product));
    }

    public boolean SetQuantityAfterSale(Product product, int salesVolume) {

        int currentQuantity = getProductFromListOfProducts(product).getQuantity();
        if (currentQuantity >= salesVolume) {
            getProductFromListOfProducts(product).setQuantity(currentQuantity - salesVolume);
            return true;
        } else {
            System.out.println("Sprzedaż niemożliwa, nie ma tyle towaru.");
        }
        return false;
    }

    public void showAllAvailableProduct() {
        for (Product currentProduct : listOfProducts)
            if (isAvailableProduct(currentProduct)) {
                System.out.print("Nazwa produktu: " + currentProduct.getName());
                System.out.print("Producent: " + currentProduct.getNameOfProducer());
                System.out.println(" Ilość na magazynie: " + currentProduct.getQuantity());
            } else {
                System.out.println("Brak produktów w magazynie.");
            }
    }
}
