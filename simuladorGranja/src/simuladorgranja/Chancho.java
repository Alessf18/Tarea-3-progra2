/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorgranja;
/**
 *
 * @author Alejandro
 */
public class Chancho {

    /**
     *@author Alejandro
     */
    public String nombre="Chancho";
    private final String sonido="Oink oink";

    /**
     *
     * @param numero
     */
    public Chancho(short numero){
    nombre=nombre+numero;
    }

    /**
     *
     * @return String
     */
    public String getNombre(){
   return nombre;
   }

    /**
     *
     * @return String 
     */
    public String grunir(){
   return sonido;
   }
}
