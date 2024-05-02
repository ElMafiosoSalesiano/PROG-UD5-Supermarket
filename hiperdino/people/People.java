package hiperdino.people;

import java.util.ArrayList;

public class People {
    private static ArrayList<String> people = new ArrayList<>(20);

    public static String people() {
        people.add("Otakupercha");
        people.add("Pepe Panadero");
        people.add("Ezequiel Gomero");
        people.add("Amanda");
        people.add("Colombiano 1");
        people.add("Colombiano 2");
        people.add("Colombiano 3");
        people.add("Kevin");
        people.add("Estado de Israel");
        people.add("Claudia");
        people.add("Dios Alexis");
        people.add("Cefo");
        people.add("Saúl");
        people.add("Marco");
        people.add("Kevin");
        people.add("Joshmar");
        people.add("Oriana");
        people.add("Obama");
        people.add("Pedro Sánchez");
        people.add("Gokú");
        String productsReturn;
        int randomIndex = (int) (Math.random() * 20);
        productsReturn = people.get(randomIndex);
        return productsReturn;
    }
}