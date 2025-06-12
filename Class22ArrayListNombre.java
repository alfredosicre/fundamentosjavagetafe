import java.util.ArrayList;
import java.util.Scanner;

public class Class22ArrayListNombre {

    // psvm
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> coleccion = new ArrayList<String>();

        // pedimos los nombres por pantalla
        String texto = "";
        while (texto.equalsIgnoreCase("stop") == false) {

            System.out.println("Introduzca el nombre (stop fin): ");
            texto = teclado.nextLine();
            if (texto.equalsIgnoreCase("stop") == false) {
                coleccion.add(texto);  
            }
            
        }
        // mostramos el listado de nombres introducidos
        for(String elemento : coleccion){
            System.out.println("Nombre: " + elemento);
        }

        // otra manera de mostrarlos
        for(int i = 0; i < coleccion.size(); i++){
            String elemento = coleccion.get(i);
            System.out.println("Nombre: " + elemento);            
        }

        // mostramos el total de nombres de nuestra coleccion
        System.out.println("Numero de elementos: " + coleccion.size());
        System.out.println("Fin de programa");
    }
    
}
