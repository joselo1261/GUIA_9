/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_guia9.servicio;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Joselo
 */
    public class ArregloService {
 
    
    // Método inicializarA recibe un arreglo por parámetro y lo inicializa con
    // números aleatorios.
    public void inicializarA(double[] A) {
    
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.round(Math.random() * 100);
        }
             
    }
      
    
    // Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    public void mostrar(double[] A) {
         
        for (int i = 0; i < A.length; i++) {
           System.out.println("[" + A[i] + "]");
        }

    }
   
    
    // Método ordenar recibe un arreglo por parámetro y lo ordena de
    // mayor a menor.
    public void ordenar(double[] A) {
        
        Double[] B = Arrays.stream(A).boxed().toArray(Double[]::new);
        Arrays.sort(A);
        System.out.println("Mayor a menor: " + Arrays.toString(A));
        System.out.println(" ");
        Arrays.sort(B, Comparator.reverseOrder());
        System.out.println("Menor a mayor: " + Arrays.toString(B));
        System.out.println(" ");
    }
    
    
    // Método inicializarB copia los primeros 10 números del arreglo A en el
    // arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    public void inicializarB(double[] A, double[] B) {
        System.arraycopy(A, 0, B, 0, 10);
        Arrays.fill(B, 10, B.length, 0.5);
        mostrar(B);
    }

}
