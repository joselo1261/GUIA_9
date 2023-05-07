/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_guia9;

import ejercicio2_guia9.entidad.ParDeNumeros;
import ejercicio2_guia9.servicio.ParDeNumerosService;

/**
 *
 * @author Joselo
 */
public class Ejercicio2_guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumeros pn=new ParDeNumeros();
        ParDeNumerosService pserv= new ParDeNumerosService();
        
        pserv.mostrarValores(pn);
        System.out.println("El mayor de ambos numeros es: "+pserv.devolverMayor(pn));
        System.out.println(" ");
        System.out.println("Metodo 1");
        System.out.println("La potencia del numero mayor elevado al menor da: " + pserv.calcularPotencia(pn));
        System.out.println(" ");
        System.out.println("Metodo 2");
        System.out.println("La potencia del numero mayor elevado al menor da: " + pserv.calcularPotencia2(pn));
        System.out.println(" ");
        System.out.println("Metodo 1");
        System.out.println("La raiz cuadrada del numero menor es: " + pserv.calcularRaiz(pn));
        System.out.println(" ");
        System.out.println("Metodo 2");
        System.out.println("La raiz cuadrada del numero menor es: " + pserv.calcularRaiz2(pn));
        System.out.println(" ");
              
             
    }
    
}
