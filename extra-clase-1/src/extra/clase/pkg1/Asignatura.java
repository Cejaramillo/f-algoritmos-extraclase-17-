/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra.clase.pkg1;

/**
 *
 * @author Carolina
 */
public class Asignatura {
    private String nombre;
    private String creditos;
    
    public Asignatura(String creditos){
        this.creditos=creditos;
    }
    public String getCreditos(){
        return creditos;
    }
}
