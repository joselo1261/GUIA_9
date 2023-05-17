/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_extras_guia9;

import ejercicios_extras_guia9.IntegerServicio.ClaseInteger;
import ejercicios_extras_guia9.entidad.Integ;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Joselo
 */
public class Ejercicios_extras_guia9 {

    public static void main(String[] args) {
    
   Integ nro= new Integ();     
   ClaseInteger clsInt = new ClaseInteger();
   
   Scanner sc = new Scanner(System.in);
        int opcion;
        do { 
            System.out.println("-------------------------- EJERCICIOS CLASE INTEGER -------------------------");
            System.out.println("======================");
            System.out.println("1. Determinar si un número entero es un número primo");
            System.out.println("2. Determinar si un número entero es un número perfecto");
            System.out.println("3. Encontrar el número entero más grande que se puede representar con n bits");
            System.out.println("4.                                                  ");
            System.out.println("5.                                                  ");
            System.out.println("6. Limpiar Pantalla");
            System.out.println("7. Salir");
            System.out.println(" ");
            System.out.println(" ");
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese opcion: "));
            
            switch (opcion) {
                case 1:
                    boolean primo= clsInt.esPrimo();
                    if (primo){
                        System.out.println("El numero es primo.");  
                        } else {
                        System.out.println("El numero no es primo.");
                        }
                    System.out.println(" ");
                    break;
                case 2:
                    clsInt.esPerfecto();
                    System.out.println(" ");
                    break;
                case 3:
                    clsInt.nBits();
                    System.out.println(" ");
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    clsInt.limpiar(1000);
                    break;
                case 7:
                    System.out.println("Ud. esta saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción incorrecta, intente nuevamente.");
                    break;
            }
        } while (opcion != 7);
   
   
        
        
        
        
        
    }
    
}
