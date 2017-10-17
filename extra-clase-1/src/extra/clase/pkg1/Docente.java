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
public class Docente {
    private String nombres;
    private String apellidos;
    private String asignatura1;
    private String asignatura2;
    private String titulo_tercer_nivel;
    private String titulo_cuarto_nivel;
    
    public Docente(String nombres,String apellidos, String asignatura1,String asignatura2, String titulo_tercer_nivel, 
            String titulo_cuarto_nivel){
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.asignatura1=asignatura1;
        this.asignatura2=asignatura2;
        this.titulo_tercer_nivel=titulo_tercer_nivel;
        this.titulo_cuarto_nivel=titulo_cuarto_nivel;
        
        
    }
    public String getNombres(){
        return nombres;
    }
    public String getApellidos(){
        return apellidos;
    }
    public String getAsignatura1(){
        return asignatura1;
    }
    public String getAsignatura2(){
        return asignatura2;
    }
    public String getTitulo_tercer_nivel(){
        return titulo_tercer_nivel;
    }
    public String getTitulo_cuarto_nivel(){
        return titulo_tercer_nivel;
    }
}
