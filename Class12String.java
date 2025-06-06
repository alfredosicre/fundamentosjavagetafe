import org.w3c.dom.Text;

public class Class12String {

   // psvm
   public static void main(String[] args) {
    
        String texto = "Desarrollo con Java";

        System.out.println("Longitud del texto: " + texto.length());
        System.out.println("toLower()" + texto.toLowerCase());
        System.out.println("toUpper()" + texto.toUpperCase());

        // buscamos la letra a de diversas formas:

        System.out.println("indexOf('a'): " + texto.indexOf('a'));

        // buscamos a partir de un indice, en este caso del 4

        System.out.println("indexOf('a', 4): " + texto.indexOf('a', 4));

        // empieza por el final
        System.out.println("lastIndexOf('a'): " + texto.lastIndexOf('a'));
        System.out.println("lastIndexOf('a'), 17: " + texto.lastIndexOf('a', 17));

        // nos quedamos con una parte de la cadena
        System.out.println("substring(5): " + texto.substring(5));
        System.out.println("substring(2,4): " + texto.substring(2,4));

        System.out.println("startsWith('h')" + texto.startsWith("D"));

        System.out.println("endsWith('a'): " + texto.endsWith("a"));

        // aplicar un metodo a un objeto, no implica que el objeto sea modificado
        // convertimos el texto a mayusculas
        texto.toUpperCase();
        // si deseamos modificar el objeto texto, debemos igualarlo
        texto = texto.toUpperCase();

        //Recuperar un caracter
        System.out.println("charAt(5): "
            + texto.charAt(5));

        // como recorrer un string caracter a caracter
        for(int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
            System.out.println("Letra (" + i + "):" + letra);
        }
        

        System.out.println(texto);





   } 
    
}
