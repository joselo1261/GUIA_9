/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia9;

import ejercicio1_guia9.entidad.Cadena;
import ejercicio1_guia9.servicio.CadenaServicio;
import java.util.Scanner;


/**
 *
 * @author Joselo
 */
public class Ejercicio1_guia9 {
public static void main(String[] args) {
     Cadena c= new Cadena();
     CadenaServicio cs= new CadenaServicio();
     
     cs.mostrarVocales(c);
     cs.invertirFrase(c);
     cs.vecesRepetido(c);
     cs.compararLongitud(c);
     cs.unirFrase(c);
     cs.reemplazar(c);
     if (cs.contiene(c)){
         System.out.println("Contiene la letra buscada");
     }else
         System.out.println("No contiene la letra buscada");
 }
    
}
    
    
    