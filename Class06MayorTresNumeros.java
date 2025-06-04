import java.util.Scanner;

public class Class06MayorTresNumeros {

    // psvm
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el primer numero: ");
        String dato = teclado.nextLine();
        int num1 = Integer.parseInt(dato);

        System.out.println("Introduzca el segundo numero: ");
        dato = teclado.nextLine();
        int num2 = Integer.parseInt(dato);

        System.out.println("Introduzca el tercer numero: ");
        dato = teclado.nextLine();
        int num3 = Integer.parseInt(dato);

        // toda variable siempre debe ser instanciada antes de poder utilizar, por eso inicializamos mayor a cero.
        int mayor = 0;
        int menor = 0;
        int inter = 0;

        // Calculamos el mayor

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        }else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        }else{
            mayor = num3;
        }
        System.out.println("El número mayor es: " + mayor);

        // Calculamos el menor

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
        }else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
        }else{
            menor = num3;
        }
        System.out.println("El número menor es: " + menor);

        // Calculamos el del medio

        if (num1 > num2 && num1 < num3) {
            inter = num1;
        }else if (num2 > num1 && num2 < num3) {
            inter = num2;
        }else{
            inter = num3;
        }
        System.out.println("El número intermedio es: " + inter);
        // tambien se puede calcular el intermedio como
        // int suma = num1+num2+num3;
        // inter = suma-mayor-menor;


    }

    
}
