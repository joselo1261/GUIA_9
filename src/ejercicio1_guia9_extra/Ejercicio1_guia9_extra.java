/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia9_extra;

import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class Ejercicio1_guia9_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] meses = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };
        System.out.println("Ingrese el Mes Secreto");
        int mesSec=leer.nextInt();
        String mesSecreto = meses[mesSec]; // Puedes cambiar el índice para cambiar el mes secreto
        
        String intento;

        do {
            System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
            intento = leer.nextLine();
            if (intento.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            }
        } while (!intento.equals(mesSecreto));

        leer.close();
    }
}
