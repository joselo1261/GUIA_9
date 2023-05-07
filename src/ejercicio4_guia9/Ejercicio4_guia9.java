/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_guia9;

import ejercicio4_guia9.servicio.FechaService;
import java.util.Date;

/**
 *
 * @author Joselo
 */
public class Ejercicio4_guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService fs = new FechaService();
        Date fechaNac = fs.fechaNacimiento();
        Date fechaActual = fs.fechaActual();
        System.out.println("Fecha de nacimiento: "+ fechaNac);
        System.out.println(" ");
        System.out.println("Fecha actual: " + fechaActual);
        System.out.println(" ");
        System.out.println("Metodo 1");
        System.out.println(" ");
        fs.diferencia(fechaActual, fechaNac);
        System.out.println(" ");
        System.out.println("Metodo 2");
        System.out.println(" ");
        fs.diferencia2(fechaActual, fechaNac);
        System.out.println(" ");
        
               
    }
    
}
        
 
