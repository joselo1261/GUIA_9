/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_guia9.servicio;

import ejercicio5_guia9.entidad.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona p = new Persona();
    
    
    // Método crearPersona que pida al usuario Nombre y fecha de
    // nacimiento de la persona a crear. Retornar el objeto Persona creado.
    public Persona crearPersona() {

        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese el dia de nacimiento:");
        int dd = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        int mm = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        int aa = leer.nextInt();
        Date fechaNac = new Date(aa-1900,mm-1,dd);
        
        System.out.println("Fecha de nacimiento: " + fechaNac);
        
        return new Persona(nombre, fechaNac);

    }
    
    
    // Método calcularEdad que calcule la edad del usuario utilizando el
    // atributo de fecha de nacimiento y la fecha actual.
    public int calcularEdad(Persona p) {
        
        LocalDate fechaNac = p.getFechaNac().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaActual = LocalDate.now();
        Period period = Period.between(fechaNac, fechaActual);

        return period.getYears();
    }
    
    
    // Método menorQue recibe como parámetro una Persona y una edad.
    // Retorna true si la persona es menor que la edad consultada o false
    // en caso contrario.
    public boolean menorQue(Persona p,Persona p2, int edad) {
        int edad2 = calcularEdad(p2);
        
        return edad2 < edad;
    }
    
    
    // Método mostrarPersona que muestra la información de la persona deseada.
    public void mostrarPersona(Persona p) {
        
        System.out.println("Persona: " + p.getNombre());
        System.out.println("Fecha de nacimiento: " + p.getFechaNac());
        
    }
    
}
