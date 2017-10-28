/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import deportes.*;
/**
 *
 * @author Carolina
 */
public class Principal {
    public static void main(String[] args) {
        Jugador listaJugadores[] = new Jugador[6];
            
        listaJugadores[0] = new Jugador("Manuel Alvarez","Arquero",20);
        listaJugadores[1] = new Jugador ("Eduardo Valencia" ," Defensa" ,21);
        listaJugadores[2] = new Jugador("Fabian Cevallos","Defensa",30);
        listaJugadores[3] = new Jugador("Antonio Lara","Centrocampista",32);
        listaJugadores[4] = new Jugador("Luis Delgado","Centrocampista",17);
        listaJugadores[5] = new Jugador("Xavier Lopez","Delantero ",25);

        
        Tecnico listaTecnicos[] = new Tecnico[3];
        
        listaTecnicos[0] = new Tecnico("Luis Gomez","Técnico Principal",45);
        listaTecnicos[1] = new Tecnico("Julio Neto","Asistente Técnico ",46);
        listaTecnicos[2] = new Tecnico("Marco Silva","Preparador Físico ",47);
        
        Equipo equipo = new Equipo("Boca Juniors", "BCJR", "1980", listaJugadores, listaTecnicos);
        
        System.out.printf("Equipo %s\n",  equipo.obtener_Nombre());
        
        System.out.printf("Sus técnicos son:\n%s\n%s\n%s\n", listaTecnicos[0], listaTecnicos[1], listaTecnicos[2]);
        
        System.out.printf("Sus jugadores son:\n%s\n%s\n%s\n%s\n%s\n%s\n", listaJugadores[0], listaJugadores[1], listaJugadores[2], listaJugadores[3], listaJugadores[4], listaJugadores[5]);

        System.out.println(equipo);

    }
}
