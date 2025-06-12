import java.util.Scanner;

public class Class25MetodoPositivo {


    // psvm
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // pedimos el numero por pantalla
        System.out.println("Introduzca un número: ");
        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);

        //llamamos al metodo
        String data = evaluarNumero(numero);
        // sacamos por pantalla la solucion
        System.out.println(data);




    }

    public static String evaluarNumero(int numero){
        String respuesta = "";
        if (numero > 0) {
            respuesta = "POSITIVO";
        }else if (numero == 0) {
            respuesta = "CERO";
        }else{
            respuesta = "NEGATIVO";
        }
        return respuesta;

    }
    
}
