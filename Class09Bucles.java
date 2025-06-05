import java.util.Scanner;

public class Class09Bucles {

   // psvm
   public static void main(String[] args) {
    
        // bucles contador (for)
        // debemos indicar un inicio, un final, un incremento
        // podemos tener un incremento distinto
        for(int i = 1; i <= 5; i++){

            System.out.println("For: " + i);

        }
        // incrementar de 3 en 3
        for(int i = 1; i<= 10; i+=3){
            System.out.println("Tres en tres: " + i);
        }
        // un bucle inverso
        for(int i = 7; i>0; i--){
            System.out.println("Inverso " + i);
        }



        // bucles de condicion
        // necesitan una condicion para salir
        // bucles infinitos. Necesitamos una variable de salida del bucle
        int contador = 1;
        while (contador <= 5) {
            System.out.println("While: " + contador);
            contador++;
        }

        // necesito mostrar los 20 primeros numeros pares:
        for(int i = 2; i <= 20; i++){
            // preguntamos si un numero es par, se utiliza el operador %
            if (i % 2 == 0) {
                System.out.println("Numeros pares: " + i);   
            }
            
        }

        // vamos a pedir al usuario textos hasta que escriba stop
        Scanner teclado = new Scanner(System.in);

        // Java no compara en los String con los operadores == ni !=
        // por lo que esto no funciona
        //while (dato != "stop") {
        //    System.out.println("stop para salir");
        //    dato = teclado.nextLine();
        //}
        // para comparar se utiliza el método equals() de la clase string

        String dato = "";
        while (dato.equals("stop") == false) {
            System.out.println("stop para salir");
            dato = teclado.nextLine();
        }
        String[]miCasa = {"uno","dos","tres","cuatro"};
        for(int i =0; i <=3; i++){
            
        }


   } 
    
}
