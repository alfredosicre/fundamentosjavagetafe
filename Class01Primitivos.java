

import java.util.Scanner;

public class Class01Primitivos {

    // psvm
    public static void main(String[] args) {
        // CONVERSION AUTOMATICA
        // byte menor = 15;
        // int mayor = menor; // esto es automatico, un tipo mayor en un tipo menor.

        // CONVERSION ENTRE TIPOS PRIMITIVOS COMPATIBLES
        // int mayor = 15;
        // byte menor = (byte) mayor;

        // CONVERTIR UN PRIMITIVO A STRING. (PARSE())
        // String texto = "12";
        // int variable = Integer.parseInt(texto);

        // CONVERTIR CUALQUIER OBJETO A SRTING (toString).
        // String texto = "12";
        // texto = Integer.toString(mayor);
        // texto = Byte.toString(menor);
        
        // CONVERTIR CUALQUIER STRING A PRIMITIVO (valueOf)
        // int numero = 15;
        // String texto = String.valueOf(numero); // "15"

        // Clase Scanner, nos permite pedir datos por teclado en terminal.
        //java.util.Scanner uno;
        //java.util.Scanner dos;
        //java.util.Scanner tres; // o si definimos arriba import.java.util.Scanner

        //Scanner uno;
        //Scanner dos;
        //Scanner tres;

        // para pedir un dato por teclado, (NextLine())
        // definimos la variable teclado para introducie datos por teclado
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca su nombre");
        // recuperamos en la variable teclado los valores introducidos por teclado
        String nombre = teclado.nextLine();
        // lo ponemos en pantalla
        System.out.println("Bienvenido a Java " + nombre);



        System.out.println ("Fin de programa");
    }
}