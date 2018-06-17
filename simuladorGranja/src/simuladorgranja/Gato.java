/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorgranja;

/**
 *
 * @author Laboratorio x
 */
public class Gato {
   public String nombre="Gato"; 
   private final String sonido="Meow";
   public Gato(short numero){
   nombre=nombre+numero;
   }
   public String getNombre(){
   return nombre;
   }
   public String maullar(){
   return sonido;
   }
}
