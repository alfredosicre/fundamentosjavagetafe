public class Class19Arrays {

    // psvm
    public static void main(String[] args) {
        
        // declaramos un array
        String[] nombres = new String[3];

        // podemos acceder a sus posiciones mediante el indice
        // podemos visualizar la longitud

        System.out.println("Longitud del array: " + nombres.length);

        // si queremos darle valores
        nombres[0] = "Lucia";
        nombres[1] = "Adrian";
        nombres[2] = "Diana";

        // para recorrerlo
        for(int i = 0; i < nombres.length; i++){

            System.out.println("Nombres: " + i + " = " + nombres[i]);

        }

        // tambien podemos tener un array inicializado con contenido

        int[] numeros = new int[] {11,14,23,54,23,54,45,76,89,12};

        System.out.println("Longitud del array: " + numeros.length);

    }
    
}
