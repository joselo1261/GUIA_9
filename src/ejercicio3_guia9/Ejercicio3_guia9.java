/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_guia9;

import ejercicio3_guia9.servicio.ArregloService;

/**
 *
 * @author Joselo
 */
public class Ejercicio3_guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];
        
        ArregloService as = new ArregloService();
        
        as.inicializarA(A);
        System.out.println(" ");
        as.mostrar(A);
        System.out.println(" ");
        as.ordenar(A);
        System.out.println(" ");
        as.inicializarB(A,B);
        System.out.println(" ");
        
         
        
    }
    
}
