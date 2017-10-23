/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;
import paquete_academico.*;
import paquete_estudiante.Estudiante;
import paquete_general.Pais;


/**
 *
 * @author carolina
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Asignatura a= new Asignatura();
        a.establecer_creditos("(10créditos)");
        Asignatura a1=new Asignatura();
        a1.establecer_creditos(("(8créditos)"));
        
        Asignatura a2=new Asignatura();
        a2.establecer_creditos(("(9créditos)"));
        Asignatura a3 = new Asignatura();
        a3.establecer_creditos(("(7créditos)"));
        
        Carrera c = new Carrera();
        c.establcer_nombre(" de la carrera Sistemas ");
        c.establecer_modalidad(" Modalidad(Presencial)");
        Carrera c1 = new Carrera();
        c1.establcer_nombre(" de la carrera Ingeniería Química");
        c1.establecer_modalidad(" Modalidad(Presencial)");
        
        
        Universidad u = new Universidad();
        u.establecer_siglas("(UTPL)");
        Universidad u1 = new Universidad();
        u1.establecer_siglas("(UTE)");
        Universidad p = new Universidad();
        p.establecer_tipo_pais("Ecuador");
        
        Docente d = new Docente ();
        d.establecer_nombre("Docente: Mario Alcivar ");
        d.establecer_tipo_pais("-Colombia");
        Docente d1 = new Docente ();
        d1.establecer_nombre("Docente: Maria Ruiz ");
        d1.establecer_tipo_pais("-Perú");
        
        Docente d2 = new Docente ();
        d2.establecer_nombre("Docente: Luis Armijos  ");
        d2.establecer_tipo_pais("-Venezuela");
        /*Docente d3 = new Docente ();
        d3.establecer_nombre("Docente: Maria Ruiz ");
        d3.establecer_tipo_pais("-Perú");*/
        
        Estudiante s1 = new Estudiante();
        s1.establecer_nombre("Luis V.");
        s1.establecer_apellido("Peres J.");
        s1.establecer_asignatura_1("Matemáticas"+c.obtener_nombre()+a.obtener_creditos()+c.obtener_modalidad()+d.obtener_nombre()+d.obtener_tipo_pais());
        s1.establecer_tipo_universidad("Universidad Tecnica Particar de Loja"+ u.obtener_siglas()+p.obtener_tipo_pais());
        s1.establecer_asignatura_2("Física"+c.obtener_nombre()+a1.obtener_creditos()+c.obtener_modalidad()+d1.obtener_nombre()+d1.obtener_tipo_pais());
        
        System.out.println(s1);
        
        Estudiante s2 = new Estudiante();
        s2.establecer_nombre("Ana.");
        s2.establecer_apellido("Lima J.");
        s2.establecer_asignatura_1("Biología"+c1.obtener_nombre()+a2.obtener_creditos()+c1.obtener_modalidad()+d2.obtener_nombre()+d2.obtener_tipo_pais());
        s2.establecer_tipo_universidad("Universidad Técnica Equinoccial"+ u1.obtener_siglas()+p.obtener_tipo_pais());
        s2.establecer_asignatura_2("Física"+c1.obtener_nombre()+a3.obtener_creditos()+c.obtener_modalidad()+d1.obtener_nombre()+d1.obtener_tipo_pais());
        
        System.out.println(s2);
        
        
        
    }
}
