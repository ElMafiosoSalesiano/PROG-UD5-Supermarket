package hiperdino;

import java.util.Scanner;

import hiperdino.checkout.Checkout;
import hiperdino.client.Client;

public class Main {
    public static void main(String[] args) {
        final Scanner SCANNER = new Scanner(System.in);
        int optionOne;
        String menuSupermarket = """
                |***********BIENVENIDO AL SUPERMERCADO HYPERDINO**************|
                |                                                             |
                |          ESCRIBIR EL NÚMERO DE LA OPCIÓN DESEADA            |
                |                                                             |
                |   1.-ABRIR CAJA.                                            |
                |   2.-AÑADIR UN NUEVO CLIENTE A ESPERA.                      |
                |   3.-ATENDER CLIENTE.                                       |
                |   4.-VER CLIENTES PENDIENTES.                               |
                |   5.-CERRAR SUPERMERCADO                                    |
                |*************************************************************|
                    """;
        boolean openedProgram = true;
        boolean checkOut = false;

        do {

            System.out.println(menuSupermarket);
            optionOne = SCANNER.nextInt();
            switch (optionOne) {
                case 1:
                    System.out.println("¿Abrir caja?");
                    System.out.println("Para abrir la caja escribe 'si'");
                    String optionUser = SCANNER.next();
                    String optionYes = "si";
                    if (checkOut) {
                        System.out.println("la caja ya se encontraba abierta");
                    } else {
                        if (optionUser.equals(optionYes)) {
                            checkOut = true;
                            System.out.println("se abrió la caja, pueden pasar");
                        } else {
                            System.out.println("no indicaste la palabra correcta");
                            System.out.println("La caja no está abierta");
                        }
                    }

                    break;
                case 2:
                    if (checkOut) {
                        Checkout.addClient();
                        System.out.println(Client.clientMenu());
                    } else {
                        System.out.println("La caja no está abierta por lo tanto no es posible añadir clientes");
                    }
                    break;
                case 3:
                    if (checkOut) {
                        Checkout.serveCustomer();
                    } else {
                        System.out.println("La caja no está abierta por lo tanto no es posible atender cliente");
                    }
                    break;
                case 4:
                    if (checkOut) {
                        Checkout.showClients();

                    } else {
                        System.out.println("No está la caja abierta por lo que no hay clientes pendientes que mostrar");
                    }
                    break;
                case 5:
                    if (Client.getName().isEmpty()) {
                        System.out.println("Caja cerrada");
                        openedProgram = false;
                        checkOut = false;
                        System.out.println("gracias por confiar en nuestra tienda, vuelva pronto.");
                        System.out.println("Fin del programa");
                    }
                    else{
                        System.out.println("No puede cerrar la caja, hay clientes esperando");
                    }
                    break;
                default:
                    System.out.println("no has escogido ninguna opción");
                    break;
            }

        } while (openedProgram);

        SCANNER.close();
    }
}