/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_guia9.servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class FechaService {
    Scanner leer = new Scanner(System.in);
    
    // Método fechaNacimiento que pregunte al usuario día, mes y año de
    // su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
    // El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
    // new Date(anio, mes, dia);
    public Date fechaNacimiento() {
        
        System.out.println("Ingrese una fecha de nacimiento.");
        System.out.println("Ingrese el Dia: ");
        int dd = leer.nextInt();
        System.out.println("Ingrese el Mes: ");
        int mm = leer.nextInt();
        System.out.println("Ingrese el Año: ");
        int aa = leer.nextInt();
        
        return new Date(aa-1900,mm-1,dd);
    }
    
    // Método fechaActual que cree un objeto fecha con el día actual. Para
    // esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
    // fechaActual = new Date();
    // El método debe retornar el objeto Date.
    public Date fechaActual() {
        return new Date();
    }
    
    
    // Método diferencia que reciba las dos fechas por parámetro y retorna
    // la diferencia de años entre una y otra (edad del usuario).
    public void diferencia(Date fechaActual, Date fechaNac) {
        int a = fechaActual.getYear() - fechaNac.getYear();
        
        if (fechaActual.getMonth() < fechaNac.getMonth() ) {
            a--;
            if (fechaActual.getDay() < fechaNac.getDay() ) {
                a--;
            }
        }
        System.out.println("Edad: " + a);
        
    }
    
    public void diferencia2(Date fechaActual, Date fechaNac) {
        long b = (fechaActual.getTime() - fechaNac.getTime())/31536000000L;
        System.out.println("Edad: " + b);
    }
    
    
    
}
