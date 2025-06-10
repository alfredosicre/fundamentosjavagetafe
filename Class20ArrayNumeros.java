import java.util.Scanner;

public class Class20ArrayNumeros {

    // psvm
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // definimos el array
        int[] numeros = new int[10];
        // pedimos los 10 numeros por pantalla

        for(int i = 0; i < 10; i++){

            System.out.println("Introduzca el " + (i+1) + " numero: ");
            String textoNumero = teclado.nextLine();
            // convertimos el string en int
            String aux = String.valueOf(textoNumero);
            int numero = Integer.parseInt(aux);

            numeros[i] = numero;
        }

        
        // vemos que hay en el array
        for(int i = 0; i < numeros.length; i++){

            System.out.println("Números: " + i + " = " + numeros[i]);

        }        

        //calculamos el mayor, el menor, la media y la suma
        int max = 0;
        int min = numeros.length;
        double media = 0;
        int suma = 0;

        // Bucle para iterar a través de los elementos del array
        for (int i = 0; i < numeros.length; i++) {

            max = Math.max(numeros[i], max);
            min = Math.min(numeros[i], min);
            suma += numeros[i];
        
        }

        media = suma / numeros.length;

        System.out.println("El valor máximo en el array es.: " + max);
        System.out.println("El valor menor en el array es..: " + min);
        System.out.println("La media en el array es........: " + media);
        System.out.println("La suma en el array es.........: " + suma);

    }
}

