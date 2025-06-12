import java.util.ArrayList;
import java.util.Scanner;

public class Class23ArrayListNumeros {

    // psvm
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> coleccion = new ArrayList<Integer>();

        // pedimos los nombres por pantalla
        Integer numero = 0;
        int suma = 0;
        while (numero != -1) {

            System.out.println("Introduzca el numero (-1 fin): ");
            String dato = teclado.nextLine();
            numero = Integer.parseInt(dato);

            if (coleccion.indexOf(numero) != -1) { // miramos si el numero introducido esta repetido
                System.out.println("¡¡¡ NÚMERO REPETIDO !!!, teclea otro  ");
                System.out.println("");

            }   else if (numero.equals(-1) == false){
                coleccion.add(numero);  
                suma = suma + numero;
            }
            
        } // fin while


        // mostramos el listado de nombres introducidos
        for(Integer elemento : coleccion){
            System.out.println("Número: " + elemento);
        }
        System.out.println("");
        // otra manera de mostrarlos
        for(int i = 0; i < coleccion.size(); i++){
            Integer elemento = coleccion.get(i);
            System.out.println("Número: " + elemento);            
        }

        // mostramos el total de nombres de nuestra coleccion
        System.out.println("Numero de elementos: " + coleccion.size());
        System.out.println("La suma de los elementos es: " + suma);
        System.out.println("Fin de programa");


    }
    
}
