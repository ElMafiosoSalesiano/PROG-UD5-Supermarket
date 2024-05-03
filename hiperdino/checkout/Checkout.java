package hiperdino.checkout;

import java.util.LinkedList;
import java.util.Queue;

import hiperdino.client.Client;
import hiperdino.people.People;
import hiperdino.products.Products;

public class Checkout {
    private static Queue<Client> clientes = new LinkedList<>();
    private int checkout = 1;
    
    public static void addClient(){
        Client cliente = new Client(Products.randomBuyList(), People.people());
        clientes.add(cliente);
        System.out.println("cliente añadido satisfactoriamente");
    }

    


}