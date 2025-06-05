    import java.util.Scanner;

public class Class11Collatz {

    // pediremos un numero al usuario y demostraremos la conjetura de Collatz
    // Si el numero es par, se divide entre 2
    // si el numero es impar, se multiplica por 3 y se suma 1
    // siguiendo este proceso todo numero debe terminar en 1

    // psvm
    public static void main(String[] args) {

        // pedimos el numero por teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un NÚMERO distinto de 1: ");
        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);
    
        while (numero != 1) {
            
            if (numero % 2 == 0) {
                numero = numero / 2;
            }else{
                numero = (numero * 3) + 1;
            }
            System.out.println("valor: " + numero);
        }

    }

    
}
