import java.util.Scanner;

public class Class13CalcularDni {

    // psvm
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca DNI SIN LETRA: ");
        String dato = teclado.nextLine();
        int numeroDni = Integer.parseInt(dato);

        String letraDni = "TRWAGMYFPDXBNJZSQVHLCKET";
        // hacer el calculo: ( nº DNI - (Ent(nº DNI / 23) * 23))

        // dentro de java tenemos una clase que nos permite realizar operaciones matematicas con numeros:
        // Math

        int resultado = (numeroDni - (numeroDni / 23) * 23);
        char letra = letraDni.charAt(resultado);

        System.out.println("Su letra del DNI es: " + letra);

    }
    
}
