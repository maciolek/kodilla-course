package com.kodilla.good.patterns.challenges.foodproducers;

import java.util.*;

public class AvailableProducts {

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
            System.out.println("Brak dostępnych produktów.");
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


//    public void showAllAvailableProduct(Product product) {
//        if (listOfProduct.containsValue(product)) {
//            for (Product current : listOfProduct.values()) {
//                System.out.println("Produkt: " + current.getName()
//                        + " ilość na magazynie: " + current.getQuantity());
//                System.out.println(current.toString());
//            }
//        }
//    }
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
// 8888888888888

 /*   private Map<ExtraFoodShopProducer, Product> listOfProduct = new HashMap<ExtraFoodShopProducer, Product>();

    public boolean addProduct(ExtraFoodShopProducer producer, Product product) {
        if (listOfProduct.containsValue(product) && listOfProduct.containsKey(producer)) {
            System.out.println("Błąd, produkt tego producenta już znajduje się na liście");
            return false;
        } else {
            listOfProduct.put(producer, product);
            return true;
        }
    }

    public Map<ExtraFoodShopProducer, Product> getListOfProduct() {
        return listOfProduct;
    }

    public boolean isAvailableProduct(Product product) {
        //       for (Map.Entry<ExtraFoodShopProducer, Product> current : listOfProduct.entrySet()) {
        if (listOfProduct.containsValue(product)) {
        } else {
            System.out.println("Brak dostępnych produktów");
            return false;
        }
        return true;
    }

//    public void showAllAvailableProduct(Product product) {
//        if (listOfProduct.containsValue(product)) {
//            for (Product current : listOfProduct.values()) {
//                System.out.println("Produkt: " + current.getName()
//                        + " ilość na magazynie: " + current.getQuantity());
//                System.out.println(current.toString());
//            }
//        }
//    }
//
*/