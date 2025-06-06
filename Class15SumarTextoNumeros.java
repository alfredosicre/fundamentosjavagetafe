import java.util.Scanner;

public class Class15SumarTextoNumeros {

    // psvm
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // pedimos el numero por pantalla
        System.out.println("Introduzca el numero: ");
        String textoNumeros = teclado.nextLine();

        int suma = 0; // variable para sumar el resultado

        // hacemos el bucle
        for(int i = 0; i < textoNumeros.length(); i++){
            //capturamos cada letra del texto
            char letra = textoNumeros.charAt(i);
            //convertir el char a int. 
            // '1' --> char
            // "1" --> String
            String aux = String.valueOf(letra);
            int numero = Integer.parseInt(aux);
            suma += numero;
        }
        System.out.println("La suma de " + textoNumeros + " es " + suma);

    }
    
}
