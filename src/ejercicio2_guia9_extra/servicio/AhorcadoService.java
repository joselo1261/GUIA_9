/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_guia9_extra.servicio;

import ejercicio2_guia9_extra.entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class AhorcadoService {

    Ahorcado nuevo = new Ahorcado();
    
        
    String partida;
    Scanner leer = new Scanner(System.in);

    /* Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas mÃ¡xima. 
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
DespuÃ©s ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un Ã­ndice del vector.
Y tambiÃ©n, guarda la cantidad de jugadas mÃ¡ximas y el valor que ingresÃ³ el usuario.*/
    public void crearJuego() {

        int index;

        System.out.println("Ingrese la palabra a buscar:");
        partida = leer.nextLine();
        System.out.println("Ingrese cantidad de jugadas maxima:");
        nuevo.setJugadasM(leer.nextInt());
        nuevo.setN(partida.length());

        //metodo 1:
        String[] aux = new String[partida.length()];

        for (int i = 0; i < partida.length(); i++) {
            aux[i] = partida.substring(i, i + 1);
        }

        nuevo.setPalabra(aux);

        System.out.print(Arrays.toString(nuevo.getPalabra()));
        System.out.println(" ");

        // metodo 2:
//        char[] vector = new char[partida.length()];
//        for (int i = 0; i < partida.length(); i++) {
//            index = i;
//            vector[i] = partida.charAt(i);
//            
//        }
//        for (int i = 0; i < partida.length(); i++) {
//            System.out.print(vector[i]);
//        }
//        System.out.println(" ");

        //configura el valos de jugadas con la longitud
        nuevo.setJugadasM(partida.length());

        // imprime cantidad de intentos:
        System.out.println("Cantidad de intentos: " + nuevo.getJugadasM());

    }

    //MÃ©todo longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
    public int longitud() {

        return partida.length();
    }

    // MÃ©todo buscar(letra):  este mÃ©todo recibe una letra dada por el usuario 
    // y busca si la letra ingresada es parte de la palabra o no. TambiÃ©n informarÃ¡ si la letra estaba o no.
    public void buscar() {
        System.out.println("Ingrese una letra: ");
        nuevo.setLetra(leer.next());

        
    // Cuenta las veces que aparece la letra en el vector palabra.
        int contSi = 0;
        
        for (int i = 0; i < partida.length(); i++) {
            if (nuevo.getLetra().equalsIgnoreCase(nuevo.getPalabra()[i])) {
                contSi++;
            }}
        if (contSi > 0) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra no se encuentra");
        }
    }

//  Metodo encontradas(letra):  que reciba una letra ingresada por el usuario 
//  y muestre cuantas letras han sido encontradas y cuÃ¡ntas le faltan. 
//    Este metodo ademas debera¡ devolver true si la letra estaba y false si la letra no estaba, 
//   ya que, cada vez que se busque una letra que no estÃ©, se le restarÃ¡ uno a sus oportunidades.
    public void encontradas(){
        int contE = 0;
        for (int i = 0; i < partida.length(); i++) {
        if (nuevo.getLetra().equalsIgnoreCase(nuevo.getPalabra()[i])) {
            contE++;
        }
        }
        System.out.println("Numero de letras encontradas: " + contE + " Faltantes: " + (partida.length() - contE));
    }
   
    
    public void intentos(){
        int contE = 0;
        for (int i = 0; i < partida.length(); i++) {
            if (nuevo.getLetra().equalsIgnoreCase(nuevo.getPalabra()[i])) {
                contE++;
            } else
                nuevo.setJugadasM(i-1);
        }
                   
        System.out.println("Numero de letras encontradas: "+ contE + " Faltantes: "+(partida.length()-contE));
    }
}
    
    




