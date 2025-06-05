import java.util.Scanner;

public class Class10TablaMultiplicar {

    // pediremos un numero al usuario y mostraremos la tabla de multiplicar de dicho numero
    // psvm
    public static void main(String[] args) {
        // pedimos el numero por pantalla
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un NÚMERO: ");
        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);
        
        
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }



    }

    
}
