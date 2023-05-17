/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_guia9_extra2.servicio;

import ejercicio2_guia9_extra2.entidad.Ahorcado;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Joselo
 */
public class AhorcadoService {
    Ahorcado ahorcado = new Ahorcado();
    
    // Metodo crearJuego(): le pide la palabra al usuario y cantidad de
    // jugadas máxima. Con la palabra del usuario, pone la longitud de la
    // palabra, como la longitud del vector. Después ingresa la palabra en el
    // vector, letra por letra, quedando cada letra de la palabra en un índice
    // del vector. Y también, guarda la cantidad de jugadas máximas y el
    // valor que ingresó el usuario.
    public void crearJuego(Ahorcado ahorcado) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la palabra: ");
        String palabraUsuario = sc.nextLine();
        
        System.out.print("Ingrese la cantidad de jugadas máximas: ");
        int jugadasMaximas = sc.nextInt();
        
        ahorcado.setPalabra(palabraUsuario.toCharArray());
        ahorcado.setJugadasMaximas(jugadasMaximas);
        ahorcado.setLetrasEncontradas(0);
    }
    
    
    // Método longitud(): muestra la longitud de la palabra que se debe
    // encontrar. Nota: buscar como se usa el vector.length.
    public int longitud(Ahorcado ahorcado) {
        return ahorcado.getPalabra().length;
    }
    
    
    // Método buscar(letra): este método recibe una letra dada por el
    // usuario y busca si la letra ingresada es parte de la palabra o no.
    // También informará si la letra estaba o no.
    public boolean buscar(Ahorcado ahorcado, char letra) {
        boolean letraEncontrada = false;
        char[] palabra = ahorcado.getPalabra();
        
        for (char c : palabra) {
            if (c == letra) {
                letraEncontrada = true;
                break;
            }
        }
        
        return letraEncontrada;
    }
    
    // Método encontradas(letra): que reciba una letra ingresada por el
    // usuario y muestre cuantas letras han sido encontradas y cuántas le
    // faltan. Este método además deberá devolver true si la letra estaba y
    // false si la letra no estaba, ya que, cada vez que se busque una letra
    // que no esté, se le restará uno a sus oportunidades.
    public boolean encontradas(Ahorcado ahorcado, char letra) {
        if (buscar(ahorcado, letra)) {
            ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
            return true;
        } else {
            ahorcado.setJugadasMaximas(ahorcado.getJugadasMaximas() - 1);
            return false;
        }
    }
        
    // Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    public int intentos(Ahorcado ahorcado) {
        return ahorcado.getJugadasMaximas();
    }
    
    
    // Método juego(): el método juego se encargará de llamar todos los
    // métodos previamente mencionados e informará cuando el usuario
    // descubra toda la palabra o se quede sin intentos. Este método se
    // llamará en el main.
    public void juego(Ahorcado ahorcado) {
        crearJuego(ahorcado);
        
        while (ahorcado.getLetrasEncontradas() < ahorcado.getPalabra().length && ahorcado.getJugadasMaximas() > 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese una letra: ");
            char letra = sc.next().charAt(0);
            
            if (encontradas(ahorcado, letra)) {
                System.out.println("Letra encontrada");
            } else {
                System.out.println("Letra no encontrada, oportunidades restantes: " + intentos(ahorcado));
            }
        }
        
        if (ahorcado.getLetrasEncontradas() == ahorcado.getPalabra().length) {
            System.out.println("Felicidades, has encontrado la palabra!");
        } else {
            System.out.println("Se acabaron las oportunidades, la palabra era: " + String.valueOf(ahorcado.getPalabra()));
        }
    }
}
    
