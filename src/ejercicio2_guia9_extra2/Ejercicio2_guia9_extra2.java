/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_guia9_extra2;

import ejercicio2_guia9_extra2.entidad.Ahorcado;
import ejercicio2_guia9_extra2.servicio.AhorcadoService;

/**
 *
 * @author Joselo
 */
public class Ejercicio2_guia9_extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ahorcado ahorcado = new Ahorcado();
        AhorcadoService ahorcadoServ = new AhorcadoService();
        
        ahorcadoServ.juego(ahorcado);
        
        
    }
}
