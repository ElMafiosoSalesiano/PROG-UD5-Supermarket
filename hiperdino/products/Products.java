package hiperdino.products;

import java.util.ArrayList;
import java.util.Stack;

public class Products {

    private static ArrayList<String> products = new ArrayList<>(12);

    public static String products() {
        products.add("Papas Ruffles Sabor Jamón");
        products.add("Pasta de Dientes");
        products.add("Chocolate Valor");
        products.add("Aguacate");
        products.add("Papaya");
        products.add("Membrillo");
        products.add("Aceite Virgen Extra");
        products.add("Platanos Canarios");
        products.add("Pollo Asado Tamaño Colosal");
        products.add("Jamon De York Marca El Pozo");
        String productsReturn;
        int randomIndex = (int) (Math.random() * 10);

        productsReturn = products.get(randomIndex);
        return productsReturn;
    }

    public static Stack<String> randomBuyList() {
        Stack<String> randomAmount = new Stack<>();
        int randomAmountProducts = (int) (Math.random() * (10 - 1) + 1);
        for (int i = 0; i < randomAmountProducts; i++) {
            randomAmount.add(Products.products());
        }
        for (int i = 0; i < randomAmountProducts; i++) {
            randomAmount.get(i);
        }
        return randomAmount;
    }
}
