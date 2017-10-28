/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportes;

/**
 *
 * @author Carolina
 */
public class Jugador {
   private String nombre;
   private String posicion;
   private int edad;

    public Jugador() {
    }
   
   public Jugador(String n, String p, int e){
       nombre=n;
       posicion=p;
       edad=e;
   }
   public void establecer_nombre(String n){
       nombre=n;
   }
   public void establecer_posicion(String p){
       posicion=p;
   }
   public void establecer_edad(int e){
       edad=e;
   }
   public String obtener_nombre(){
       return nombre;
   }
   public String obtener_posicion(){
       return posicion;
   }
   public int obtener_edad(){
       return edad;
   }
@Override
     public String toString(){
        String cadena = String.format("   %s - %s - %s años", 
                obtener_nombre(),
                obtener_posicion(),
                obtener_edad());
        
        
     return cadena;
}
}
