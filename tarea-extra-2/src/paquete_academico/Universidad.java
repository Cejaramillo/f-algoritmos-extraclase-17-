/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

/**
 *
 * @author Carolina
 */
public class Universidad {
   private String nombre;
   private String siglas;
   private String tipo_pais;
   
   public void establecer_nombre( String n){
       nombre=n;
   }
   public void establecer_siglas(String s){
       siglas=s;
   }
   public void establecer_tipo_pais(String p){
       tipo_pais=p;
   }
   public String obtener_nombre(){
       return nombre;
   }
   public String obtener_siglas(){
       return siglas;
   }
   public String obtener_tipo_pais(){
       return tipo_pais;
   }
       @Override
    public String toString(){
        String cadena = String.format("%s - %s - %s", obtener_nombre(),
                obtener_siglas(), obtener_tipo_pais());
        return cadena;
    }
}
