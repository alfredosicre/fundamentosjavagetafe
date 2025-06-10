import java.util.Scanner;

public class Class16Narcisista {

    // psvm
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // pedimos el numero por pantalla
        System.out.println("Introduzca el numero: ");
        String textoNumero = teclado.nextLine();

        int longitud = textoNumero.length(); // calculamos la longitud del texto introducido
        int suma = 0;
        String aux01 = String.valueOf(textoNumero);
        int numeroComprobar = Integer.parseInt(aux01);

        for(int i = 0; i < longitud; i++){
           
            char letra = textoNumero.charAt(i); //capturamos cada letra del texto
            String aux = String.valueOf(letra); // la convertimos primero a string para que nos de el valor real
            int numero = Integer.parseInt(aux); // la convertimos a número y ya tenemos el valor en numerico

            int potencia = (int) Math.pow(numero, longitud);
            System.out.println("La potencia de " + numero + " es " + potencia );
            suma += potencia; 

        }
        if (numeroComprobar == suma) {
            System.out.println("La suma de las potencias es: " + suma + " EL NUMERO ES NARCISISTA");
        }else{
            System.out.println("La suma de las potencias es: " + suma + " EL NUMERO NO ES NARCISISTA");
        }
    }
    
}
