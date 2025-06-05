// INTRODUZCA HORAS SEMANALES                                
// INTRODUZCA IMPORTE HORA:        
// INTRODUZCA KILOMETROS:  

import java.util.Scanner;

public class Class08CalcularSalario {

    // psvm
    public static void main(String[] args) {

        // definicion de variables
        int horaExtra = 0; // horas extras
        //int imporHoraExtra = 0; // importe horas extras
        String dieta = " "; // dieta segun km
        int salario = 0; // salario
        int salarioExtra = 0; // salario extra.

        Scanner teclado = new Scanner(System.in);

        // Introduccion de horas semanales, importe horas y kilometros:

        System.out.println("Introduzca HORAS SEMANALES: ");
        String dato = teclado.nextLine();
        int horas = Integer.parseInt(dato);

        System.out.println("Introduzca IMPORTE HORA: ");
        dato = teclado.nextLine();
        int imporHora = Integer.parseInt(dato);

        System.out.println("Introduzca KILOMETROS: ");
        dato = teclado.nextLine();
        int km = Integer.parseInt(dato);

        // calcular las horas extras y el importe de las horas extras
        if (horas > 36) {
            horaExtra = horas - 36;
            // calculamos el salario sin horas extras
            salario = 36 * imporHora;
            salarioExtra = horaExtra * (imporHora + 2);
            salario = salario + salarioExtra;
        }else{
            salario = horas * imporHora;
        }

        // calculamos el destino:
        String[]destino = {"NACIONAL","INTERNACIONAL","PROVINCIAL"};

        if (km >= 101 && km <= 900) {
            dieta = destino[0];
            }else if (km > 900) {
                dieta = destino[1];
                }else {
                    dieta = destino[2];
                }

        // empezamos a poner los datos por pantalla:
        System.out.println("HORAS TRABAJADAS.........: " + horas);
        System.out.println("HORAS EXTRAS.............: " + horaExtra);
        System.out.println("IMPORTE DE LA HORA.......: " + imporHora);
        System.out.println("DESTINO..................: " + dieta);
        System.out.println("SALARIO BASE.............: " + salario);
        System.out.println("SALARIO HORAS EXTRA......: " + salarioExtra);
        System.out.println("SALARIO BRUTO............: " + (salario + salarioExtra));
        System.out.println("IVA (16%)................: " + ((salario + salarioExtra) * 0.16));




    }
    
}
