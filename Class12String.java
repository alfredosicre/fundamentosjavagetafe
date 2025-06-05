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

        // aplicar un metodo a un objeto, no implica que el objeto sea modificado
        // convertimos el texto a mayusculas
        texto.toUpperCase();
        // si deseamos modificar el objeto texto, debemos igualarlo
        texto = texto.toUpperCase();
        
        System.out.println(texto);





   } 
    
}
