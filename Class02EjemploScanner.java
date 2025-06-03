import java.util.Scanner;

public class Class02EjemploScanner {
    public static void main(String[] args) {
        
    

    Scanner teclado1 = new Scanner(System.in);
    System.out.println("Introduzca su nombre: ");
    String nombre = teclado1.nextLine();


    System.out.println("Bienvenido a Java " + nombre);

    System.out.println("Introduzca su edad: ");
    Scanner teclado2 = new Scanner(System.in);
    String edad = teclado2.nextLine();
    System.out.println("Tu edad es: " + edad);
    
    }

}
