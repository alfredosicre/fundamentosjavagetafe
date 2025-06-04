import java.util.Scanner;

public class Class07DiaNacimiento {

    // psvm
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca DIA: ");
        String dato = teclado.nextLine();
        int dia = Integer.parseInt(dato);

        System.out.println("Introduzca MES: ");
        dato = teclado.nextLine();
        int mes = Integer.parseInt(dato);

        System.out.println("Introduzca AÑO: ");
        dato = teclado.nextLine();
        int anio = Integer.parseInt(dato);

        if (mes == 1) {
            mes = 13;
            anio = anio - 1;
            // anio -= 1;
        }
        if (mes == 2) {
            mes = 14;
            anio = anio - 1;
        }

        // paso 1
        int paso01 = (((mes+1) * 3) / 5);
        // paso 2
        int paso02 = anio / 4;
        // paso 3
        int paso03 = anio / 100;
        // paso 4
        int paso04 = anio / 400;
        // paso 5
        int paso05 = dia + (mes*2) + anio + paso01 + paso02 - paso03 + paso04 +2;
        // paso 6
        int paso06 = paso05 / 7;
        // paso 7
        int paso07 = paso05 - (paso06*7);
        
        // una manera de hacerlo con una tabla
        String[]diaSemana = {"SABADO","DOMINGO","LUNES","MARTES","MIERCOLES","JUEVES","VIERNES"};
        System.out.println("El día de la semana es: " + diaSemana[paso07]);

        // otra manera de hacerlo con IF
        if (paso07 == 0) {
            System.out.println("El día de nacimiento corresponde a SABADO");
        }
        if (paso07 == 1) {
            System.out.println("El día de nacimiento corresponde a DOMINGO");
        }
        if (paso07 == 2) {
            System.out.println("El día de nacimiento corresponde a LUNES");
        }
        if (paso07 == 3) {
            System.out.println("El día de nacimiento corresponde a MARTES");
        }
        if (paso07 == 4) {
            System.out.println("El día de nacimiento corresponde a MIERCOLES");
        }
        if (paso07 == 5) {
            System.out.println("El día de nacimiento corresponde a JUEVES");
        }
        if (paso07 == 6) {
            System.out.println("El día de nacimiento corresponde a VIERNES");
        }
    }    


    
}
