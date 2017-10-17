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
public class Titulo {
    private String nombre;
    private String nombre_universidad;
    
    public Titulo( String nombre_universidad){
        this.nombre_universidad=nombre_universidad;
    }
    public String getNombre_universidad(){
        return nombre_universidad;
    }
}
