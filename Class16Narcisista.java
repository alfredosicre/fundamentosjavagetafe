import java.util.Scanner;

public class Class16Narcisista {

    // psvm
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // pedimos el numero por pantalla
        System.out.println("Introduzca el numero: ");
        String textoNumero = teclado.nextLine();

        // calculamos la longitud del texto introducido
        int longitud = textoNumero.length();
        int suma = 0;
        String aux01 = String.valueOf(textoNumero);
        int numeroComprobar = Integer.parseInt(aux01);

        for(int i = 0; i <= longitud; i++){
           //capturamos cada letra del texto
            char letra = textoNumero.charAt(i); 
            String aux = String.valueOf(letra);
            int numero = Integer.parseInt(aux);

            double potencia = Math.pow(numero, longitud);
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
