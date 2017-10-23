/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_estudiante;

/**
 *
 * @author Carolina
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String asignatura_1;
    private String asignatura_2;
    private String tipo_universidad;
    
    public void establecer_nombre(String n){
        nombre=n;
    }
    public void establecer_apellido(String a){
        apellido=a;
    }
    public void establecer_asignatura_1(String a1){
        asignatura_1=a1;
    }
    public void establecer_asignatura_2(String a2){
        asignatura_2=a2;
    }
    public void establecer_tipo_universidad(String u){
        tipo_universidad=u;
    }
    public String obtener_nombre(){
        return nombre;
    }
    public String obtener_apellido(){
        return apellido;
    }
     public String obtener_tipo_universidad(){
        return tipo_universidad;
     }
    public String obtener_asignatura_1(){
        return asignatura_1;
    }
    public String obtener_asignatura_2(){
        return asignatura_2;
    }
 @Override
     public String toString(){
        String cadena = String.format("Datos del Estudiante \n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Universidad: %s\n"
                + "Tiene las siguientes asignaturas:\n"
                + "\t\tAsignatura 1: %s\n"
                + "\t\tAsignatura 2: %s\n"
                ,obtener_nombre(),
                obtener_apellido(),
                obtener_tipo_universidad(),
                obtener_asignatura_1(),
                obtener_asignatura_2());
     return cadena;
}
}
