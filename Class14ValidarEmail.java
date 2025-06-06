import java.util.Scanner;

public class Class14ValidarEmail {

    // psvm
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // pedimos el email por pantalla
        System.out.println("Introduzca su Email: ");
        String email = teclado.nextLine();

        // calculamos la longitud del texto introducido
        int longitud = email.length();

        // vemos si hay una @ en el texto introducido
        if (email.contains("@") == false) {
            System.out.println("No existe una @ en la direccion de email !!!");

        // comprobamos que no empieza por @
        }else if (email.startsWith("@") == true){
            System.out.println("El email no puede comenzar con @ !!!");

        // comprobamos que no termina con @
        }else if (email.endsWith("@") == true) {
            System.out.println("El email no puede terminar con @ !!!");

        // comprobamos que solo hay una @
        }else if (email.indexOf('@') != email.lastIndexOf('@')) {
            System.out.println("Hay mas de una @ en el email !!!");

        // comprobamos que existe un punto
        }else if ((email.contains(".") == false)) {
            System.out.println("No Hay un PUNTO en el email !!!");

        // comprobamos que exista un punto despues de la @
        }else if (email.indexOf('@') > email.lastIndexOf('.')) {
            System.out.println("Detras de la @ no hay ningun punto !!!");

        // comprobamos que en el dominio hay de 2 a 3 caracteres, se puede hacer de varias formas
        // int ultimopunto = email.lastIndexOf(srt:".")
        // String dominio = email.substring(untimoPunto + 1)
        // if (dominio.length() >= 2 && dominio.length() <= 3){
        // el dominio es correcto}


        }else if (email.lastIndexOf('.') > (longitud - 3)) {
            System.out.println("DOMINIO NO VALIDO !!!");

        }else{
            System.out.println("Email correcto !!!");
        }



    }
    
}
