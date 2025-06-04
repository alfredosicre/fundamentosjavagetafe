// condicion if.

import java.util.Scanner;

public class Class04PositivoNagativo {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);

        if (numero > 0) {

            System.out.println("El numero es positivo");
            
        }else if (numero == 0) {
                System.out.println("El numero es igual a cero ");
        }   else {
                System.out.println("El numero es negativo");
            }

        System.out.println("Fin de programa");

    }

    
}
