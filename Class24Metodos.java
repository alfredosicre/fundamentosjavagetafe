public class Class24Metodos {

    // psvm
    public static void main(String[] args) { // esto es un metodo.
        
        // llamada a los metodos
        metodoAccion();
        // en los metodos return debemos almacenar la respuesta en una variable o preguntar por ella
        String saludo = metodoSaludo();
        System.out.println(saludo);
        
        // otro metodo con parametros
        int suma = sumarNumeros(3, 4);
        System.out.println(" La suma es..: " + suma);

        System.out.println("Fin de programa...");

    }
    
    // los metodos siempre van anivel de clase.

    public static void metodoAccion(){

        // un metodo de accion ejecuta codigo
        System.out.println("Soy un metodo de acciones...");
    }

    // metodos return
    public static String metodoSaludo(){
        // acciones del metodo
        return "Mi primer metodo return";
    }

    // los metodos pueden recibir parametros
    // por ejemplo, para sumar dos numeros
    public static int sumarNumeros(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
    
}
