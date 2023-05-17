/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_guia9_extra.entidad;

/**
 *
 * @author Joselo
 */
public class Ahorcado {

    private int encontradas;
    private int jugadasM;
    private int n;
    private String letra;
    String[] palabra = new String [n];

    public Ahorcado() {
    }

    public Ahorcado(int encontradas, int jugadasM, int n) {
        this.encontradas = encontradas;
        this.jugadasM = jugadasM;
        this.n = n;
        this.letra=letra;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugadasM() {
        return jugadasM;
    }

    public void setJugadasM(int jugadasM) {
        this.jugadasM = jugadasM;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }


}
