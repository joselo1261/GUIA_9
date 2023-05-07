/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_guia9;

import ejercicio5_guia9.entidad.Persona;
import ejercicio5_guia9.servicio.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class Ejercicio5_guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        PersonaService ps = new PersonaService();
        Persona p = ps.crearPersona();
        int edad = ps.calcularEdad(p);
        System.out.println("La edad es: " + edad);
        
        Persona p2 = ps.crearPersona();
        
        if (ps.menorQue(p,p2,edad)) {
            System.out.println(p2.getNombre() + " es menor que " + p.getNombre());
        } else {
            System.out.println(p.getNombre() + " es menor que " + p2.getNombre());
        }
        
        System.out.println("Ingrese que persona desea mostrar: ");
        System.out.println("Persona 1: ( 1 ) o Persona 2: ( 2 )");
       int px = leer.nextInt();
        if (px == 1) {
            ps.mostrarPersona(p);
        } else {
            ps.mostrarPersona(p2);
        }
        
    }
    
}

