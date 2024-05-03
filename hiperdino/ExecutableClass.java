package hiperdino;

import java.util.Scanner;

public class ExecutableClass {
    public static void main(String[] args) {
        final Scanner SCANNER = new Scanner(System.in);
        int optionOne;
        String menuSupermarket = """
            |***********BIENVENIDO AL SUPERMERCADO HYPERDINO**************|
            |                                                             |
            |          ESCRIBIR EL NÚMERO DE LA OPCIÓN DESEADA            |
            |                                                             |
            |   1.-ABRIR CAJA.                                           |
            |   2.-AÑADIR UN NUEVO CLIENTE A ESPERA.                      |
            |   3.-ATENDER CLIENTE.                                       |
            |   4.-VER CLIENTES PENDIENTES.                               |
            |   5.-CERRAR SUPERMERCADO                                    |
            |*************************************************************|
                """;
        boolean closeProgram = true;
        do {
            
            System.out.print("\033[H\033[2J");  
            System.out.println(menuSupermarket);
            optionOne = SCANNER.nextInt();
            switch (optionOne) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    closeProgram = false;
                    break;
                default:

                    break;
            }


        } while (closeProgram);
    }
}