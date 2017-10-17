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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Docente d1 = new Docente ("Luis V.","Perez J.","Matemáticas","Física","Licenciado en Físico Matemáticas","Magister en Docencia Matemática");
        Docente d2 = new Docente ("Ana M.","Velez P.","Sociales","Literatura","Licenciado en Ciencias Sociales","Magister en Docencia Social");
        Asignatura a1 = new Asignatura (" con número de créditos 8"); 
        Asignatura a2 = new Asignatura (" con número de créditos 6"); 
        Asignatura a3 = new Asignatura (" con número de créditos 9"); 
        Asignatura a4 = new Asignatura (" con número de créditos 10");
        Titulo t1 = new Titulo(" - Universidad Politécnica");
        Titulo t2 = new Titulo(" - Universidad Valenciana");
        Titulo t3 = new Titulo(" - Universidad Salesiana");
        Titulo t4 = new Titulo(" - Universidad Cataluña");
        
        System.out.println("Datos del docente 1");
        System.out.println("Nombre: " + d1.getNombres());
        System.out.println("Apellido: " + d1.getApellidos());
        System.out.println("Tiene a su cargo las asignaturas:");
        
        System.out.println("Asignatura1: " + d1.getAsignatura1() + a1.getCreditos());
        System.out.println("Asignatura2: " + d1.getAsignatura2() + a2.getCreditos());
        System.out.println("El docente tiene los siguientes títulos académicos");
        System.out.println("Título 3er nivel: " + d1.getTitulo_tercer_nivel() + t1.getNombre_universidad()); 
        System.out.println("Título 4er nivel: " + d1.getTitulo_cuarto_nivel() + t2.getNombre_universidad()); 
    
        System.out.println("----------------------------------------------------------------------------");
        
        System.out.println("Datos del docente 2");
        System.out.println("Nombre: " + d2.getNombres());
        System.out.println("Apellido: " + d2.getApellidos());
        System.out.println("Tiene a su cargo las asignaturas :");
        System.out.println("Asignatura1: " + d2.getAsignatura1() + a3.getCreditos());
        System.out.println("Asignatura2: " + d2.getAsignatura2() + a4.getCreditos());
        System.out.println("El docente tiene los siguientes títulos académicos");
        System.out.println("Título 3er nivel:: " + d2.getTitulo_tercer_nivel() + t3.getNombre_universidad()); 
        System.out.println("Título 4er nivel:: " + d2.getTitulo_cuarto_nivel() + t4.getNombre_universidad()); 
    }
    
}
