import java.util.ArrayList;

public class Class27MetodoNarcisista {

    // psvm
    public static void main(String[] args) {
        
        // creamos una arraylist para almacenar los numeros narcisistas
        ArrayList<Integer> narcisistas = new ArrayList<Integer>();

        // creamos un bucle para comprobar los 20.000 primeros numeros si son narcisistas
        boolean resp = evaluar(153);
        System.out.println(resp);
        int numero = 0;
         while (numero <= 20000) {
             numero ++;
             boolean respuesta = evaluar(numero);
             if (respuesta == true) { // si la respuesta es true, añadimos el numero a el arraylist
                 narcisistas.add(numero);
             }
         }
        // visualizamos por pantalla todos los numeros narcisistas
        for(int elemento : narcisistas){
             System.out.println("Número narcisista: " + elemento);
        }
        // borramos la arraylist
        narcisistas.clear();
    }
    // metodo para saber si el numero es narcisista o no
    // -------------------------------------------------
    public static boolean evaluar(int numero){
        
        String dato = String.valueOf(numero); // convierto a string el numero
        int longitud = dato.length(); // miro la longitud de la cadena
        int suma = 0;
        for (int i = 0; i < longitud; i++){

            char letra = dato.charAt(i); // recupero en letra el digito que voy a usar
            String aux = String.valueOf(letra); // lo paso a un string intermedio para despues convertirlo a numero
            int valor = Integer.parseInt(aux); // lo conviero a numerico
            int operacion = (int) Math.pow(valor, longitud);
            suma += operacion;

        }
        if (suma == numero){
            return true;
        }else{
            return false;
        }

    }
    
}
