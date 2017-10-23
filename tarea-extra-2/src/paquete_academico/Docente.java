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
public class Docente {
 private String nombre;
 private String apellido;
 private String tipo_pais;
 
 public void establecer_nombre(String n){
     nombre=n;
 }
 public void establecer_apellido(String a){
     apellido=a;
 }
 public void establecer_tipo_pais(String p){
     tipo_pais=p;
 }
 public String obtener_nombre(){
     return nombre;
 }
 public String obtener_apellido(){
     return apellido;
 }
 public String obtener_tipo_pais(){
     return tipo_pais;
 }
 @Override
     public String toString(){
        String cadena = String.format("Datos del Docente\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Tiene a su cargo las asignaturas:\n"
                , obtener_nombre(),
                obtener_apellido(),
                obtener_tipo_pais());
        return cadena;
    }
    
}
