/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_guia9.servicio;

import ejercicio6_guia9.entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class CursoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
 
    // Método cargarAlumnos(): este método le permitirá al usuario ingresar
    // los alumnos que asisten a las clases. Nosotros nos encargaremos de
    // almacenar esta información en un arreglo e iterar con un bucle,
    // solicitando en cada repetición que se ingrese el nombre de cada alumno.
    public void cargarAlumnos(String[] alumnos) {

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno: ");
            alumnos[i] = leer.next(); 
        }

    }
    
    // Mostrar
    public void mostrar(String[] alumnos) {
        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("[" + alumnos[i] + "]");
        }
    }
    
    
    // Método crearCurso(): el método crear curso, le pide los valores de
    // los atributos al usuario y después se le asignan a sus respectivos
    // atributos para llenar el objeto Curso. En este método invocamos al
    // método cargarAlumnos() para asignarle valor al atributo alumnos
    public Curso crearCurso(String[] a) {
        
        System.out.println("Ingrese el nombre del curso: ");
        String nombreCurso = leer.next();
        System.out.println("Ingrese la cantidad de horas por dia: ");
        int cantidadHorasPorDia = leer.nextInt();
        System.out.println("Ingrese la cantidad de dias por semana: ");
        int cantidadDiasPorSemana = leer.nextInt();
        System.out.println("Ingrese el turno (M/T): ");
        String turno = leer.next();

        while (!turno.equalsIgnoreCase("m") && !turno.equalsIgnoreCase("t")) {
            System.out.println("La opcion ingresada es incorrecta. Vuelva a intentarlo:");
            turno = leer.next();
        }

        System.out.println("Ingrese el precio por hora: ");
        double precioPorHora = leer.nextDouble();
        String[] alumnos = a;
        
        return new Curso(nombreCurso,cantidadHorasPorDia,cantidadDiasPorSemana,turno,precioPorHora,alumnos);
        
    }
    
    
    // Método calcularGananciaSemanal(): este método se encarga de
    // calcular la ganancia en una semana por curso. Para ello, se deben
    // multiplicar la cantidad de horas por día, el precio por hora, la
    // cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
    public double calcularGananciaSemanal(Curso c,String[] alumnos) {
        int cant = alumnos.length;
        return c.getCantidadHorasPorDia() * c.getPrecioPorHora() * cant * c.getCantidadDiasPorSemana();
    }
    
}
