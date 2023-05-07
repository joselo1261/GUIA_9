/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia9.servicio;

import ejercicio1_guia9.entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class CadenaServicio {
    private Cadena cadena;
    Scanner leer= new Scanner(System.in);
    Scanner sc= new Scanner(System.in);
//    MÃ©todo mostrarVocales(), deberÃ¡ contabilizar la cantidad de vocales
//que tiene la frase ingresada.
    public int mostrarVocales(Cadena c) {
        System.out.println("ingrese la frase");
        String frase= leer.nextLine().toLowerCase();
        c.setFrase(frase);
        int cont= 0;
        for (int i = 0; i < frase.length(); i++) {
          char letra= frase.charAt(i);
          if (letra== 'a'||letra== 'e'||letra== 'i'||letra== 'o'||letra== 'u') {
            cont++;  
          }
        }
        System.out.println("La cant de vocales en la frase " + c.getFrase()+" son " + cont);
        return cont;
    }
    
//b) MÃ©todo invertirFrase(), deberÃ¡ invertir la frase ingresada y mostrarla
//por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
//asac".
    public void invertirFrase(Cadena c) {
        String fraseInv= "";
        for (int i = c.getFrase().length()-1; i >=0; i--) {
            fraseInv+= c.getFrase().charAt(i);
        }
        System.out.println("la cadena original es " + c.getFrase());
        System.out.println("La cadena invertida es " + fraseInv);
    }
    
//c) MÃ©todo vecesRepetido(String letra), recibirÃ¡ un carÃ¡cter ingresado
//por el usuario y contabilizar cuÃ¡ntas veces se repite el carÃ¡cter en la
//frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carÃ¡cter 'a' se repite 4
//veces.
         public int vecesRepetido(Cadena c) {
        System.out.println("ingrese la letra a buscar ");
         char letra= leer.next().charAt(0);
        
        int cont= 0;
        for (int i = 0; i < c.getFrase().length(); i++) {
          if (c.getFrase().charAt(i)== letra) {
              
            cont++;  
          }
        }
        System.out.println("La cant de letras en la frase " + c.getFrase() +" a buscar es " + cont);
        return cont;
    }
    
//e) MÃ©todo compararLongitud(String frase), deberÃ¡ comparar la longitud
//de la frase que compone la clase con otra nueva frase ingresada por
//el usuario.
         
         public void compararLongitud(Cadena c) {
             System.out.println("ingrese una frase nueva");
             String frase2= sc.nextLine();
             if (c.getLongitud()==frase2.length()) {
                 System.out.println(" La frase " + c.getFrase() +" y la frase " + frase2 + " tienen la misma longitud");
                 System.out.println("La longitud de ambas es " + c.getLongitud());
             }else
                  System.out.println(" La frase " + c.getFrase() +" y la frase " + frase2 + " no tienen la misma longitud");
             System.out.println("La longitud del 1ro es: " + c.getLongitud() + " y la de la 2da frase es " + frase2.length());
         }
//f) MÃ©todo unirFrases(String frase), deberÃ¡ unir la frase contenida en la
//clase Cadena con una nueva frase ingresada por el usuario y mostrar
//la frase resultante.
        public void unirFrase(Cadena c) {
             System.out.println("ingrese una frase nueva");
             String frase3= sc.nextLine();
             System.out.println("la nueva frase es: " + c.getFrase() + "--" + frase3);
        }
         
//g) MÃ©todo reemplazar(String letra), deberÃ¡ reemplazar todas las letras
//â€œaâ€� que se encuentren en la frase, por algÃºn otro carÃ¡cter
        public void reemplazar(Cadena c) {
            System.out.println("ingrese la letra a reemplazar");
            String letra= sc.nextLine();
            System.out.println("introduzca un caracter para reemplazar");
            String car= sc.nextLine();
            String nuevaFrase= c.getFrase().replace(letra, car);
            System.out.println("la frase nueva es " + nuevaFrase);
            
        }
          
        
//seleccionado por el usuario y mostrar la frase resultante.
//h) MÃ©todo contiene(String letra), debera comprobar si la frase contiene
//una letra que ingresa el usuario y devuelve verdadero si la contiene y
//falso si no.
   public boolean contiene(Cadena c) {
     System.out.println("Ingrese la letra a buscar ");
     String letra= sc.nextLine();
     return ((c.getFrase().indexOf(letra))!= -1);
       
}
}
    
    
    
    
    
   
