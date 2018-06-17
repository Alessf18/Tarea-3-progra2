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

public class Gallo {
    private  String nombre="gallo";
    private final String sonido ="quiquiriqui";

    /**
     *
     * @param numero
     */
    public Gallo(short numero){
    nombre=nombre+numero;
    }

    /**
     *
     * @return String 
     */
    public String  getNombre(){
    return nombre;
    }

    /**
     *
     * @return String 
     */
    public String cacarear(){
    return sonido;
    }
 
    
}
