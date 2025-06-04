// suma dos numeros tecleados por pantalla

import java.util.Scanner;

public class Class03SumaNumeros {

    // psvm
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("introduzca numero 1: ");

        // almacenamos el primer numero
        // el numero debemos almacenarlo como entero
        // capturo el dato como String
        String dato = teclado.nextLine();
        // convertimos el dato a int
        int numero1 = Integer.parseInt(dato);
        System.out.println("Introduzca numero 2: ");
        // volvemos a utilizar la variable dato
        dato = teclado.nextLine();
        // convertimos de nuevo el dato a int
        int numero2 = Integer.parseInt(dato);

        int suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);
        System.out.println("Fin de programa");
    }
}