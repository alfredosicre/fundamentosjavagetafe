import java.util.Scanner;

public class Class18AnalizarTexto {


    // psvm
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // pedimos el texto por pantalla
        System.out.println("Introduzca el texto: ");
        String texto = teclado.nextLine();

        // ------------------------------------------------------

        int letras = 0;
        int digitos = 0;
        int vocales = 0;
        int consonantes = 0;
        int mayusculas = 0;

        for (int i = 0; i < texto.length(); i++) {
            
            char c = texto.charAt(i);

            if (Character.isLetter(c)) {
                letras++;
                if (Character.isUpperCase(c)) {
                    mayusculas++;
                }

                char cMin = Character.toLowerCase(c);
                if (cMin == 'a' || cMin == 'e' || cMin == 'i' || cMin == 'o' || cMin == 'u') {
                    vocales++;
                } else {
                    consonantes++;
                }

            } else if (Character.isDigit(c)) {
                digitos++;
            }
        }
            System.out.println("Longitud total del texto...: " + texto.length());
            System.out.println("Número de letras...........: " + letras);
            System.out.println("Número de dígitos..........: " + digitos);
            System.out.println("Número de vocales..........: " + vocales);
            System.out.println("Número de consonantes......: " + consonantes);
            System.out.println("Número de letras mayúsculas: " + mayusculas);
    }
}
