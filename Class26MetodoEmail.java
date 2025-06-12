import java.util.Scanner;

public class Class26MetodoEmail {

    // psvm
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // pedimos el email por pantalla
        System.out.println("Introduzca su Email: ");
        String email = teclado.nextLine();

        //llamamos al metodo para validar el email
        Boolean respuesta = evaluarEmail(email);

        if (respuesta == true) {
            System.out.println("El email esta correcto: ");
        }else{
            System.out.println("El email esta incorrecto: ");
        }




    }
    // metodo para saber si el mail esta bien o mal

    public static Boolean evaluarEmail(String email){
        if (email.length() == 0) {
            return true;
        }else{
            return false;
        }

    }
