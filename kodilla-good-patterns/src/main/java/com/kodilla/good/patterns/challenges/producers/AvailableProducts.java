package com.kodilla.good.patterns.challenges.producers;

import java.util.*;

public class AvailableProducts {

    private Map<Producer, Product> listOfProduct = new HashMap<Producer, Product>();

    public boolean addProduct(Producer producer, Product product) {
        if (listOfProduct.containsValue(product) && listOfProduct.containsKey(producer)) {
            System.out.println("Błąd, produkt tego producenta już znajduje się na liście");
            return false;
        } else {
            listOfProduct.put(producer, product);
            return true;
        }
    }

    public Map<Producer, Product> getListOfProduct() {
        return listOfProduct;
    }

    public boolean isAvailableProduct(Product product) {
        //       for (Map.Entry<Producer, Product> current : listOfProduct.entrySet()) {
        if (listOfProduct.containsValue(product)) {
        } else {
            System.out.println("Brak dostępnych produktów");
            return false;
        }
        return true;
    }

    public void showAllAvailableProduct(Product product) {
        if (listOfProduct.containsValue(product)) {
            for (Product current : listOfProduct.values()) {
                System.out.println("Produkt: " + current.getNameOfProduct()
                        + " ilość na magazynie: " + current.getQuantity());
                System.out.println(current.toString());
            }
        }
    }
}


//    private List<Product> listOfProduct = new ArrayList<Product>();
//
//    public boolean addProduct(Product product) {
//        if (listOfProduct.equals(product)) {
//            System.out.println("Błąd, produkt już znajduje się na liście");
//            return false;
//        } else {
//            listOfProduct.add(product);
//            return true;
//        }


//
//    public boolean removeProduct(Product product) {
//        if (listOfProduct.equals(product)) {
//            listOfProduct.remove(product);
//            return true;
//        } else {
//            System.out.println("Błąd, produkt nie istnieje");
//            return false;
//        }
//    }
//
//    public List<Product> getListOfProduct() {
//        return listOfProduct;
//    }
//
//    public boolean isAvailableProduct(Product product) {
//        if (listOfProduct.get(listOfProduct.indexOf(product)).getQuantity() > 0) {
//            return true;
//        }
//        System.out.println("Brak dostępnych produktów");
//        return false;
//    }

//    public int quantityOfProductOfAvailableList (Product product){
//        return listOfProduct.get(listOfProduct.indexOf(product)).getQuantity();
//    }

//    public boolean substructQuantityOfSoldProduct (Product product, int quantitySoldOfProduct) {
//        listOfProduct.get(listOfProduct.indexOf(product)).setQuantity(quantityOfProductOfAvailableList(product)-quantitySoldOfProduct);
//        return false;
//    }

