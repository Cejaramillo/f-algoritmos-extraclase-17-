/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_general;

/**
 *
 * @author Carolina
 */
public class Pais {
    private String pais;
    
    public void establecer_pais(String p){
        pais = p;
    }
    public String obtener_pais(){
        return pais;
    }
@Override
    public String toString(){
        String cadena = String.format("%s ", obtener_pais());
    
    return cadena;
    }
}
