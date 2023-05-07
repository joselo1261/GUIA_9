/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_guia9.servicio;

import ejercicio2_guia9.entidad.ParDeNumeros;

/**
 *
 * @author Joselo
 */
public class ParDeNumerosService {
    // Metodo mostrarValores que muestra cuáles son los dos números guardados.
    public void mostrarValores(ParDeNumeros pn) {
        System.out.println("Número 1: " + pn.getNum1());
        System.out.println("Número 2: " + pn.getNum2());
    }
    
    // Metodo devolverMayor para retornar cuál de los dos atributos tiene el mayor valor.
    public double devolverMayor(ParDeNumeros pn) {
        return Math.max(pn.getNum1(), pn.getNum2());
    }
    
    // Método calcularPotencia para calcular la potencia del mayor valor de
    // la clase elevado al menor número. Previamente se deben redondea ambos valores.
    public double calcularPotencia(ParDeNumeros pn) {
        double mayor = Math.round(devolverMayor(pn));
        double menor = Math.round(pn.getNum1() == mayor ? pn.getNum2() : pn.getNum1());
        return Math.pow(mayor, menor);
    }
    
    public double calcularPotencia2(ParDeNumeros pn) {
        
        double n1 = Math.round(pn.getNum1());
        double n2 = Math.round(pn.getNum2());
        System.out.println("n1 = " + n1 + " n2 = " + n2);
        return Math.pow(Math.max(n2,n1), Math.min(n2,n1));
    }
    
    
    
    // Método calculaRaiz, para calcular la raíz cuadrada del menor de los
    // dos valores. Antes de calcular la raíz cuadrada se debe obtener el
    // valor absoluto del número.
    public double calcularRaiz(ParDeNumeros par) {
        double menor = Math.min(par.getNum1(), par.getNum2());
        return Math.sqrt(Math.abs(menor));
    }
    
    public double calcularRaiz2(ParDeNumeros pn) {
        return Math.sqrt(Math.min(pn.getNum1(),pn.getNum2()));
    }
   
}
