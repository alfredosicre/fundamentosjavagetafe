import java.util.Scanner;

public class Class17NumeroISBN {

    // psvm
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int multiplicacion = 0;
        
        // pedimos el numero por pantalla
        System.out.println("Introduzca el numero (10 caracteres): ");
        String textoNumero = teclado.nextLine();
        int suma = 0;

        int longitud = textoNumero.length(); // calculamos la longitud del texto introducido

        if (longitud > 10 || longitud < 10) {
           System.out.println("¡¡ El número tecleado tiene MAS o MENOS de 10 POSICIONES !!"); 
        }else{
           
            for(int i = 0; i < longitud; i++){
           
                char letra = textoNumero.charAt(i); //capturamos cada letra del texto
                String aux = String.valueOf(letra); // la convertimos primero a string para que nos de el valor real
                int numero = Integer.parseInt(aux); // la convertimos a número y ya tenemos el valor en numerico

                multiplicacion = numero * (i + 1);
                System.out.println("El número " + numero + " * " + (i+1) + " = " + multiplicacion);
                suma += multiplicacion; 

            }
            System.out.println("Número a validar...............: " + textoNumero);
            System.out.println("La longitud de caracteres es...: " + longitud);

            if (suma % 11 == 0) {
                System.out.println("¡¡ El número ISBN es CORRECTO !!");
            }else{
                System.out.println("¡¡ El número ISBN NO ES CORRECTO !!");
            }

        }
    }
    
}
