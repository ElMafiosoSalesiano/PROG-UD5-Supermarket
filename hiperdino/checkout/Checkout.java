package hiperdino.checkout;

import java.util.LinkedList;
import java.util.Queue;

import hiperdino.client.Client;
import hiperdino.people.People;
import hiperdino.products.Products;

public class Checkout {
    private static Queue<Client> clients = new LinkedList<>();
    private int checkout = 1;

    public static void addClient() {
        Client cliente = new Client(Products.randomBuyList(), People.people());
        clients.add(cliente);
        System.out.println("cliente añadido satisfactoriamente");
    }

    public static void serveCustomer() {
        if (clients.isEmpty()) {
            System.out.println("No hay clientes esperando para ser atendidos");
        } else {
            clients.poll();
            System.out.println("Cliente" + Client.getName() + "atendido con éxito");
        }
    }

    public static void showClients() {
        if (clients.isEmpty()) {
            System.out.println("No hay clientes sin atender para poder mostrar");
        } else {
            System.out.println("quedan por atender: ");
            for (Client client : clients) {
                Client.getName();
            }

        }

    }

    public static void closeCheckout(){
        if (clients.isEmpty()) {
            System.out.println("Caja cerrada");
            System.out.println("gracias por confiar en nuestra tienda, vuelva pronto.");
            System.out.println("Fin del programa");
        }
        else{
            System.out.println("No puede cerrar la caja, hay clientes esperando");
        }
    }

}