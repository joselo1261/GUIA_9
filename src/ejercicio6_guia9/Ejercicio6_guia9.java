/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_guia9;

import ejercicio6_guia9.entidad.Curso;
import ejercicio6_guia9.servicio.CursoServicio;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class Ejercicio6_guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner leer = new Scanner(System.in);
        CursoServicio cs = new CursoServicio();
                
        System.out.println("Ingrese la cantidad de alumnos: ");
        int n = leer.nextInt();
        
        String[] alumnos = new String[n];
        
        cs.cargarAlumnos(alumnos);
        cs.mostrar(alumnos);
        Curso c = cs.crearCurso(alumnos);
        
        System.out.println(Arrays.toString(c.getAlumnos()));
        System.out.println(c.toString());
        double g = cs.calcularGananciaSemanal(c,alumnos);
        System.out.println("> La ganancia semanal es: $" + g);
        
    }
    
}
