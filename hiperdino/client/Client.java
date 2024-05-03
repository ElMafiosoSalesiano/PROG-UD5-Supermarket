package hiperdino.client;

import java.util.Stack;

import hiperdino.people.People;
import hiperdino.products.Products;

public class Client {
    private static Stack<String> randomBuyList = Products.randomBuyList();
    private static String name = People.people();

    public Client(Stack<String> randomBuyList, String name) {
        Client.randomBuyList = randomBuyList;
        Client.name = name;
    }

    public static Stack<String> getRandomBuyList() {
        return randomBuyList;
    }

    public void setRandomBuyList(Stack<String> randomBuyList) {
        Client.randomBuyList = randomBuyList;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        Client.name = name;
    }

    @Override
    public String toString() {
        return "Client [randomBuyList=" + randomBuyList + ", name=" + name + ", getRandomBuyList()="
                + getRandomBuyList() + ", getName()=" + getName() + ", getClass()=" + getClass() + ", toString()="
                + super.toString() + "]";
    }

    public static String clientMenu() {
        String menu = "Nombre del cliente: " + Client.getName() +
                "\nNúmero total de productos " + Client.getRandomBuyList().size() +
                "\nLista de artículos de la cesta\n " +
                Client.getRandomBuyList();
        return menu;
    }

}