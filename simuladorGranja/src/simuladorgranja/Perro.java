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

public class Perro {
    private  String nombre="perro";
    private final String SONIDO="guau";

    /**
     *
     * @param numero
     */
    public Perro(short numero) {
        nombre = nombre + numero;
    }

    /**
     *
     * @return String 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return String 
     */
    public String ladrar() {
        return SONIDO;
    }
}
