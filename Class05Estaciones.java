// programa en el que pedimos un numero por pantalla
// del 1 al 4
// 1-primavera
// 2-verano
// 3-otoño
// 4 invierno... si tecleamos otra opcion ponemos incorrecto

import java.util.Scanner;

public class Class05Estaciones {

    // psvm
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un numero: ");
        String dato = teclado.nextLine();

        int numero = Integer.parseInt(dato);

        if (numero == 1) {
            System.out.println("Primavera");  
        }else if (numero == 2) {
                System.out.println("Verano");
                }else if (numero == 3) {
                    System.out.println("Otoño");
                    }else if (numero == 4) {
                        System.out.println("Invierno");
                        }else{
                            System.out.println("ERROR!!!");
                            }

    }

    
}
