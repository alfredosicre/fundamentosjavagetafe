import java.util.ArrayList;

public class Class21ArrayList {

    // psvm
    public static void main(String[] args) {
        
        ArrayList<String> coleccion = new ArrayList<String>();

        // agregamos tres elementos
        coleccion.add("elemento 1");
        coleccion.add("elemento 2");
        coleccion.add("elemento 3");
        coleccion.add("elemento 1");

        // vemos el numero de elementos
        System.out.println("Numero de elementos: " + coleccion.size());

        // vamos a modificar un elemento
        coleccion.set(1, "Nuevo elemento 1");
        // añadimos un elemento, lo añade en la posicion que tu le digas
        coleccion.add(1, "Insertado elemento");

        // eleiminar un elemento por indice
        coleccion.remove(4);

        // buscamos dentro de la colecccion

        System.out.println("Posicion elemento 1: " + coleccion.indexOf("elemento 1"));
        // con lastIndexOf
        System.out.println("Ultima posicion elemento 1 " + coleccion.lastIndexOf("elemento 1"));



        // con un bucle vemos el numero de elementos
        for(int i=0; i<coleccion.size(); i++){

            String elemento = coleccion.get(i);
            System.out.println(elemento);

        }
        // o tambien con un bucle de referencia:
        // for(tipo variable: conjunto)
        // en este tipo de bucles son de solo lectura el conjunto que estamos recorriendo.

        for(String elemento : coleccion){
            System.out.println(elemento);
        }

        // eliminar toda la colecccion
        coleccion.clear();
        // aqui nos daria cero
        System.out.println("Numero de elementos: " + coleccion.size());

    }

    
}
