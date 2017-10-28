/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportes;

/**
 *
 * @author Carolina
 */
public class Equipo {
    private String nombre;
    private String siglas;
    private String anio_fundacion;
    private Jugador[] jugadores;
    private Tecnico[] tecnicos;


    public Equipo(String n, String s, String a, Jugador[] jugadores, Tecnico[] tecnicos) {
        n = nombre;
        s = siglas;
        a = anio_fundacion;
        jugadores = jugadores;
        tecnicos = tecnicos;

    }
    
    public String obtener_Nombre() {
        return nombre;
    }

    public void establecer_Nombre(String nombre) {
        nombre = nombre;
    }

    public String obtener_Siglas() {
        return siglas;
    }

    public void establecer_Siglas(String siglas) {
        siglas = siglas;
    }

    public String obtener_Anio_fundacion() {
        return anio_fundacion;
    }

    public void establecer_Anio_fundacion(String anio_fundacion) {
        anio_fundacion = anio_fundacion;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void establecer_Jugadores(Jugador[] jugadores) {
        jugadores = jugadores;
    }

    public Tecnico[] obtener_Tecnicos() {
        return tecnicos;
    }

    public void establecer_Tecnicos(Tecnico[] tecnicos) {
        tecnicos = tecnicos;
    }
}
/*
    public double obtener_promedio_edad_jugadores() {
        //Jugador jugador = new Jugador();
        
        int edadTotalJ[];
        
      //  for (int i = 0; i < jugadores.length; i++) {
           // edadTotalJ = edadTotalJ + jugadores[i];
       // }
        
        //edadTotalJ = edadTotalJ + jugador.obtener_edad();
        
        //return (edadTotalJ / getJugadores().length);
    }

    
    public double obtener_promedio_edad_tecnicos() {
        
        //Tecnico tecnico = new Tecnico();
        
        int edadTotalT = 0;
        
        //edadTotalT = edadTotalT + tecnico.obtener_edad();
        
        //return (edadTotalT / getTecnicos().length);
    }
    
//    @Override
//    public String toString(){
//        String cadena = String.format("Equipo %s\nSus técnicos son:\n%s - %s - %s años\nSus jugadores son:\n%s - %s - %s\nPromedio de edad de:\nTécnicos: % años\nJugadores: %s años\n",
//                getNombre(), jugadores.
//                obtener_edadj(),
//                obtener_edadt());
//
//     
//     return cadena;
}
}
*/
