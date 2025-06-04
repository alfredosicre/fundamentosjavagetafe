// pedimos por pantalla el nombre y la edad de una persona.
import java.util.Scanner;

public class Class02EjemploScanner {
    public static void main(String[] args) {
        
    

    Scanner teclado = new Scanner(System.in);

    // pedimos un nombre y lo almacenamos en nombre.
    System.out.println("Introduzca su nombre: ");
    String nombre = teclado.nextLine();

    // pedimos la edad y lo almacenamos en edad.
    System.out.println("Introduzca su edad: ");
    String edad = teclado.nextLine();
    System.out.println("Tu edad es: " + edad);
    
    }

}
