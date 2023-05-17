/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_extras_guia9.IntegerServicio;

import ejercicios_extras_guia9.entidad.Integ;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Joselo
 */
public class ClaseInteger {
    
    // Escribe un programa que determine si un número entero es un número primo.
    // Los números primos son aquellos que solo son divisibles entre ellos mismos y el 1.
    // Así que ya tenemos la lista de números primos entre 1 y 100: 
    // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97
    public boolean esPrimo() {
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
    if (numero <= 1) {
        return false;
        }
    int cont = 2;
        boolean primo = true;
        while (primo && cont != numero) {
        if (numero % cont == 0) {
            primo = false;}
            cont++;
    }
    return primo;
    }

    
    // Escribe un programa que determine si un número entero es un número perfecto 
    // (es decir, la suma de sus factores propios es igual al número).   
    // Los números perfectos son aquellos iguales a la suma de sus divisores: 
    // Ej: 6 se puede dividir por 1, 2 y 3, y cuando sumas esos números, el resultado es 6
    // Hay solo tres números perfectos inferiores a 1000: 6, 28 y 496.
    public void esPerfecto(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        if (suma == numero) {
            System.out.println("El numero => "+numero + " : es un numero perfecto.");
        } else {
            System.out.println("El numero => "+numero + " : no es un numero perfecto.");
        }
    }
    
    
    // Escribe un programa que encuentre el número entero más grande que se puede representar con n bits 
    // (donde n es un número entero que el usuario ingresa).
    // Para calcular el número de bits que son necesarios para representar una cantidad, 
    // basta con encontrar cuál es la potencia de 2 inmediatamente inferior a la cantidad
    // y cuál es la potencia de 2 inmediatamente superior.
    // Formula: M = 2 N  −  1 determina la máxima cantidad decimal (M) 
    // que se puede representar con una palabra binaria de N bits.
    public void nBits() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de bits: "));
                
        // Calcular el entero más grande que se puede representar con n bits
        int nroMax = (int) (Math.pow(2, n) - 1);
        
        System.out.println("El numero entero más grande que se puede representar con " + n + " bits es => " + nroMax);
    }
    
    
    // Metodo para limpiar pantalla
    
    
    public void limpiar(int lineas){
    for (int i=0; i < lineas; i++)
    {
    System.out.println();
    }
}
}
        
        
    
    
    
  
   