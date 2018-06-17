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
public class Vaca {

    /**
     *@author Aleajandro
     */
    public String nombre="Vaca";
    private final String sonido ="Muuu";

    /**
     *
     * @param numero
     */
    public Vaca(short numero){
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
    public String  mugir(){
   return sonido;
   }
}
