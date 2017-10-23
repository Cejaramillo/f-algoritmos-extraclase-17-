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
public class Asignatura {
 private String nombre;
 private String creditos;
 private String tipo_carrera;
 private String tipo_docente;
 
 public void establecer_nombre(String n){
     nombre=n;
 }
 public void establecer_creditos(String c){
     creditos=c;
 }
 public void establecer_tipo_carrera(String t){
     tipo_carrera=t;
 }
 public void establecer_tipo_docente(String d){
     tipo_docente=d;
 }
 public String obtener_nombre(){
     return nombre;
 }
 public String obtener_creditos(){
     return creditos;
 }
 public String obtener_tipo_carrera(){
     return tipo_carrera;
 }
 public String obtener_tipo_docente(){
     return tipo_docente;
 }
@Override
    public String toString(){
           String cadena = String.format("%s - %s - %s - %s", obtener_nombre(),
                obtener_creditos(), obtener_tipo_carrera(), obtener_tipo_docente());
    return cadena;
    }
}
