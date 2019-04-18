package programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.ListIterator;
import java.util.Scanner;

import equipos.Equipo;
import jugadores.Jugador;

public class Programa {

	public static void main(String[] args) {
			
		
		//Creación de Jugadores
		
		ArrayList <Jugador> listaJugadores = new ArrayList <Jugador>();
		
		listaJugadores.add(new Jugador ("Sergio", "Ramos", "Real Madrid"));
		listaJugadores.add(new Jugador ("Rafael", "Varane", "Real Madrid"));
		listaJugadores.add(new Jugador ("Isco", "Alarcón", "Real Madrid"));
		listaJugadores.add(new Jugador ("Karim", "Benzema", "Real Madrid"));
		listaJugadores.add(new Jugador ("Keylor", "Navas", "Real Madrid"));
		
					
		listaJugadores.add(new Jugador ("Gerard", "Piqué", "Barcelona"));
		listaJugadores.add(new Jugador ("Sergio", "Busquets", "Barcelona"));
		listaJugadores.add(new Jugador ("Leo", "Messi", "Barcelona"));
		listaJugadores.add(new Jugador ("Jordi", "Alba", "Barcelona"));
		listaJugadores.add(new Jugador ("Luis", "Suarez", "Barcelona"));
		
		
		listaJugadores.add(new Jugador ("Diego", "Rolan", "Alavés"));
		listaJugadores.add(new Jugador ("Darko", "Brasanac", "Alavés"));
		listaJugadores.add(new Jugador ("Manu", "García", "Alavés"));
		listaJugadores.add(new Jugador ("Antonio", "Perera", "Alavés"));
		listaJugadores.add(new Jugador ("Borja", "Bastón", "Alavés"));
		
		listaJugadores.add(new Jugador ("Mikel", "San José", "Athletic Bilbao"));
		listaJugadores.add(new Jugador ("Iker", "Muniain", "Athletic Bilbao"));
		listaJugadores.add(new Jugador ("Aritz", "Aduriz", "Athletic Bilbao"));
		listaJugadores.add(new Jugador ("Iñaki", "Williams", "Athletic Bilbao"));
		listaJugadores.add(new Jugador ("Raúl", "García", "Athletic Bilbao"));
		
		listaJugadores.add(new Jugador("Diego", "Godín", "Atlético de Madrid"));
		listaJugadores.add(new Jugador("Jan", "Oblak", "Atlético de Madrid"));
		listaJugadores.add(new Jugador("Filipe", "Luis", "Atlético de Madrid"));
		listaJugadores.add(new Jugador("Antoine", "Griezmann", "Atlético de Madrid"));
		listaJugadores.add(new Jugador("Lucas", "Hernández", "Atlético de Madrid"));
		
		listaJugadores.add(new Jugador("Iago", "Aspas", "Celta"));
		listaJugadores.add(new Jugador("Mathias", "Jensen", "Celta"));
		listaJugadores.add(new Jugador("Fran", "Beltrán", "Celta"));
		listaJugadores.add(new Jugador("Gustavo", "Cabral", "Celta"));
		listaJugadores.add(new Jugador("Hugo", "Mallo", "Celta"));
		
		listaJugadores.add(new Jugador("Marko", "Dmitrovic", "Eibar"));
		listaJugadores.add(new Jugador("Asier", "Riesgo", "Eibar"));
		listaJugadores.add(new Jugador("Iván", "Ramis", "Eibar"));
		listaJugadores.add(new Jugador("Pedro", "León", "Eibar"));
		listaJugadores.add(new Jugador("Joan", "Jordán", "Eibar"));
		
		listaJugadores.add(new Jugador("Diego", "López", "Espanyol"));
		listaJugadores.add(new Jugador("Marc", "Roca", "Espanyol"));
		listaJugadores.add(new Jugador("Víctor", "Campuzano", "Espanyol"));
		listaJugadores.add(new Jugador("Sergio", "García", "Espanyol"));
		listaJugadores.add(new Jugador("Esteban", "Granero", "Espanyol"));
		
		listaJugadores.add(new Jugador("David", "Soria", "Getafe"));
		listaJugadores.add(new Jugador("Jorge", "Molina", "Getafe"));
		listaJugadores.add(new Jugador("Samu", "Sáiz", "Getafe"));
		listaJugadores.add(new Jugador("Francisco", "Portillo", "Getafe"));
		listaJugadores.add(new Jugador("Gaku", "Shibasaki", "Getafe"));
		
		listaJugadores.add(new Jugador("Gorka", "Iraizoz", "Girona"));
		listaJugadores.add(new Jugador("Pedro", "Porro", "Girona"));
		listaJugadores.add(new Jugador("Borja", "García", "Girona"));
		listaJugadores.add(new Jugador("Pere", "Pons", "Girona"));
		listaJugadores.add(new Jugador("Bernardo", "Espinosa", "Girona"));
		
		listaJugadores.add(new Jugador("Moi", "Gómez", "Huesca"));
		listaJugadores.add(new Jugador("David", "Ferreiro", "Huesca"));
		listaJugadores.add(new Jugador("Damián", "Musto", "Huesca"));
		listaJugadores.add(new Jugador("Enric", "Gallego", "Huesca"));
		listaJugadores.add(new Jugador("Gonzalo", "Melero", "Huesca"));
		
		listaJugadores.add(new Jugador("Iván", "Cuéllar", "Leganés"));
		listaJugadores.add(new Jugador("Gerard", "Gumbau", "Leganés"));
		listaJugadores.add(new Jugador("Sabin", "Merino", "Leganés"));
		listaJugadores.add(new Jugador("Javier", "Avilés", "Leganés"));
		listaJugadores.add(new Jugador("Diego", "Reyes", "Leganés"));
		
		listaJugadores.add(new Jugador("Antonio", "Luna", "Levante"));
		listaJugadores.add(new Jugador("Sergio", "Postigo", "Levante"));
		listaJugadores.add(new Jugador("Fran", "Manzanara", "Levante"));
		listaJugadores.add(new Jugador("Pedro", "López", "Levante"));
		listaJugadores.add(new Jugador("Arturo", "Molina", "Levante"));
		
		listaJugadores.add(new Jugador("Miguel Ángel", "Morro", "Rayo Vallecano"));
		listaJugadores.add(new Jugador("Luis", "Meseguer", "Rayo Vallecano"));
		listaJugadores.add(new Jugador("José", "Pozo", "Rayo Vallecano"));
		listaJugadores.add(new Jugador("Manuel", "Navarro", "Rayo Vallecano"));
		listaJugadores.add(new Jugador("Sergio", "Moreno", "Rayo Vallecano"));
		
		listaJugadores.add(new Jugador("Giovani", "Lo Celso", "Betis"));
		listaJugadores.add(new Jugador("Sergio", "Canales", "Betis"));
		listaJugadores.add(new Jugador("Cristian", "Tello", "Betis"));
		listaJugadores.add(new Jugador("Adrián", "Tellado", "Betis"));
		listaJugadores.add(new Jugador("William", "Carvalho", "Betis"));
		
		listaJugadores.add(new Jugador("Diego", "Llorente", "Real Sociedad"));
		listaJugadores.add(new Jugador("Joseba", "Zaldua", "Real Sociedad"));
		listaJugadores.add(new Jugador("Alex", "Sola", "Real Sociedad"));
		listaJugadores.add(new Jugador("Mikel", "Oyarzabal", "Real Sociedad"));
		listaJugadores.add(new Jugador("Sandro", "Ramírez", "Real Sociedad"));
		
		listaJugadores.add(new Jugador("Moisés", "Delgado", "Valladolid"));
		listaJugadores.add(new Jugador("Roberto", "Corral", "Valladolid"));
		listaJugadores.add(new Jugador("Borja", "Fernández", "Valladolid"));
		listaJugadores.add(new Jugador("Sergi", "Guardiola", "Valladolid"));
		listaJugadores.add(new Jugador("Kuki", "Zalazar", "Valladolid"));
		
		listaJugadores.add(new Jugador("Roque", "Mesa", "Sevilla"));
		listaJugadores.add(new Jugador("Éver", "Banega", "Sevilla"));
		listaJugadores.add(new Jugador("Jesús", "Navas", "Sevilla"));
		listaJugadores.add(new Jugador("André", "Silva", "Sevilla"));
		listaJugadores.add(new Jugador("Juan", "Berrocal", "Sevilla"));
		
		listaJugadores.add(new Jugador("José", "Gayá", "Valencia"));
		listaJugadores.add(new Jugador("Carlos", "Soler", "Valencia"));
		listaJugadores.add(new Jugador("Kevin", "Gameiro", "Valencia"));
		listaJugadores.add(new Jugador("Rodrigo", "Moreno", "Valencia"));
		listaJugadores.add(new Jugador("Ezequiel", "Garay", "Valencia"));
		
		listaJugadores.add(new Jugador("Sergio", "Asenaio", "Villareal"));
		listaJugadores.add(new Jugador("Mariano", "Barbosa", "Villareal"));
		listaJugadores.add(new Jugador("Mario", "Gaspar", "Villareal"));
		listaJugadores.add(new Jugador("Manu", "Trigueros", "Villareal"));
		listaJugadores.add(new Jugador("Carlos", "Bacca", "Villareal"));
		
		
		
		
		
		
		
		//Creación de Equipos
		
			ArrayList <Equipo> listaEquipos = new ArrayList <Equipo>();
				
				
			listaEquipos.add(new Equipo ("Barcelona"));
				
			listaEquipos.add(new Equipo("Real Madrid"));
				
			listaEquipos.add(new Equipo("Atlético de Madrid"));
				
			listaEquipos.add(new Equipo("Betis"));
				
			listaEquipos.add(new Equipo("Sevilla"));
				
			listaEquipos.add(new Equipo("Getafe"));
				
			listaEquipos.add(new Equipo("Valencia"));
				
			listaEquipos.add(new Equipo("Athletic Bilbao"));
				
			listaEquipos.add(new Equipo("Alavés"));
				
			listaEquipos.add(new Equipo("Real Sociedad"));
				
			listaEquipos.add(new Equipo("Espanyol"));
				
			listaEquipos.add(new Equipo("Eibar"));
				
			listaEquipos.add(new Equipo("Leganés"));
				
			listaEquipos.add(new Equipo("Girona"));
				
			listaEquipos.add(new Equipo("Villareal"));
				
			listaEquipos.add(new Equipo("Levante"));
				
			listaEquipos.add(new Equipo("Celta"));
				
			listaEquipos.add(new Equipo("Valladolid"));
				
			listaEquipos.add(new Equipo("Rayo Vallecano"));
				
			listaEquipos.add(new Equipo("Huesca"));
		
		
		
		
		
		
		
		
		// aignacion de jugadores a sus equipos correspondientes
		
		for (int i=0; i<listaEquipos.size(); i++) {
			
			
			for (int j=0; j<listaJugadores.size(); j++) {
				
				
				if (listaJugadores.get(j).getEquipo().equals(listaEquipos.get(i).getNombre())) {
					
					
					listaEquipos.get(i).anadirJugador(listaJugadores.get(j));
					

					
				}
				
			}
		
			
		}
		
		
		ListIterator <Jugador> itJugadores = listaJugadores.listIterator();
		
		ListIterator <Equipo> itEquipos = listaEquipos.listIterator();
		
		
		
		
		//ordenacion de las listas
		
		
		Collections.sort(listaJugadores, new Comparator <Jugador> () {
			
			public int compare (Jugador j2, Jugador j1) {
				
				return new Double (j1.getElo()).compareTo(new Double(j2.getElo()));
				
			}
			
		});
		
		
		
		Collections.sort(listaEquipos, new Comparator <Equipo>() {
			
			public int compare (Equipo e2, Equipo e1) {
				
				return new Double (e1.getElo()).compareTo(new Double(e2.getElo()));
				
			}
			
			
		});
		
		
				

		//Menú del programa
		
		boolean funcionamiento;
		
		int opcion;
		
		
		do {
		
		
		
		try {
			
		funcionamiento = true;
		Scanner entrada = new Scanner (System.in);
		
				do {
			
			
			System.out.println("Qué deseas realizar?");
			System.out.println("(1) Mostrar TOP 5 Equipos");
			System.out.println("(2) Mostrar TOP 5 Jugadores");
			System.out.println("(3) Realizar y mostrar emparejamientos");
			System.out.println("(4) Mostrar todos los Equipos");
			System.out.println("(5) Mostrar todos los Jugadores");
			System.out.println("(6) Salir");
			
			opcion = entrada.nextInt();
			
			if (opcion <1 || opcion >6) {
				
				System.out.println("Por favor, introduce un numero (1-6) y pulsa la tecla 'enter'");
				System.out.println();
				
			}
			
			
			switch (opcion) {
			
			
			case 1:
				
				itEquipos = listaEquipos.listIterator();
				
				for (int i=0; i<5; i++) {
					
					itEquipos.next().infoEquipo();
					
					
				}
				
				System.out.println();
				
				break;
			
			case 2:
				
				
				itJugadores = listaJugadores.listIterator();
				
				for (int i=0; i<5; i++) {
					
					itJugadores.next().mostrarJugador();
					
				}
				
				
				
				break;
				
				
			case 3:
				
				itEquipos = listaEquipos.listIterator();
				
				
				
				while (itEquipos.hasNext()) {
					
		
					System.out.println(itEquipos.next().getNombre() + "  VS  " + itEquipos.next().getNombre());		
					System.out.println();
					
				}
				
				break;
				
			case 4: 
				
				for (Equipo team : listaEquipos) {
					
					System.out.println(team.getNombre() + "  " + team.getElo());
					
				}
				
				System.out.println();
				
				break;
				
			case 5:
				
				for (Jugador player : listaJugadores) {
					
					player.mostrarJugador();
					
				}
				
				System.out.println();
				
				break;
				
				
			case 6:
				
				System.out.println("¡Hasta pronto!");
				
				break;
				
				
			}
			
			
		}while (opcion != 6);
		
		entrada.close();
		
		}
		
		
		catch (InputMismatchException error) {
			
			funcionamiento=false;
			
			System.out.println("Por favor, introduce un numero (1-6) y pulsa la tecla 'enter'");
			System.out.println();
			
		}
		
		}while (funcionamiento == false);
		
		
	}

}
