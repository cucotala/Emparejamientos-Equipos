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
			
		
		//Creaci�n de Jugadores
		
		ArrayList <Jugador> listaJugadores = new ArrayList <Jugador>();
		
		listaJugadores.add(new Jugador ("Sergio", "Ramos", "Real Madrid"));
		listaJugadores.add(new Jugador ("Rafael", "Varane", "Real Madrid"));
		listaJugadores.add(new Jugador ("Isco", "Alarc�n", "Real Madrid"));
		listaJugadores.add(new Jugador ("Karim", "Benzema", "Real Madrid"));
		listaJugadores.add(new Jugador ("Keylor", "Navas", "Real Madrid"));
		
					
		listaJugadores.add(new Jugador ("Gerard", "Piqu�", "Barcelona"));
		listaJugadores.add(new Jugador ("Sergio", "Busquets", "Barcelona"));
		listaJugadores.add(new Jugador ("Leo", "Messi", "Barcelona"));
		listaJugadores.add(new Jugador ("Jordi", "Alba", "Barcelona"));
		listaJugadores.add(new Jugador ("Luis", "Suarez", "Barcelona"));
		
		
		listaJugadores.add(new Jugador ("Diego", "Rolan", "Alav�s"));
		listaJugadores.add(new Jugador ("Darko", "Brasanac", "Alav�s"));
		listaJugadores.add(new Jugador ("Manu", "Garc�a", "Alav�s"));
		listaJugadores.add(new Jugador ("Antonio", "Perera", "Alav�s"));
		listaJugadores.add(new Jugador ("Borja", "Bast�n", "Alav�s"));
		
		listaJugadores.add(new Jugador ("Mikel", "San Jos�", "Athletic Bilbao"));
		listaJugadores.add(new Jugador ("Iker", "Muniain", "Athletic Bilbao"));
		listaJugadores.add(new Jugador ("Aritz", "Aduriz", "Athletic Bilbao"));
		listaJugadores.add(new Jugador ("I�aki", "Williams", "Athletic Bilbao"));
		listaJugadores.add(new Jugador ("Ra�l", "Garc�a", "Athletic Bilbao"));
		
		listaJugadores.add(new Jugador("Diego", "God�n", "Atl�tico de Madrid"));
		listaJugadores.add(new Jugador("Jan", "Oblak", "Atl�tico de Madrid"));
		listaJugadores.add(new Jugador("Filipe", "Luis", "Atl�tico de Madrid"));
		listaJugadores.add(new Jugador("Antoine", "Griezmann", "Atl�tico de Madrid"));
		listaJugadores.add(new Jugador("Lucas", "Hern�ndez", "Atl�tico de Madrid"));
		
		listaJugadores.add(new Jugador("Iago", "Aspas", "Celta"));
		listaJugadores.add(new Jugador("Mathias", "Jensen", "Celta"));
		listaJugadores.add(new Jugador("Fran", "Beltr�n", "Celta"));
		listaJugadores.add(new Jugador("Gustavo", "Cabral", "Celta"));
		listaJugadores.add(new Jugador("Hugo", "Mallo", "Celta"));
		
		listaJugadores.add(new Jugador("Marko", "Dmitrovic", "Eibar"));
		listaJugadores.add(new Jugador("Asier", "Riesgo", "Eibar"));
		listaJugadores.add(new Jugador("Iv�n", "Ramis", "Eibar"));
		listaJugadores.add(new Jugador("Pedro", "Le�n", "Eibar"));
		listaJugadores.add(new Jugador("Joan", "Jord�n", "Eibar"));
		
		listaJugadores.add(new Jugador("Diego", "L�pez", "Espanyol"));
		listaJugadores.add(new Jugador("Marc", "Roca", "Espanyol"));
		listaJugadores.add(new Jugador("V�ctor", "Campuzano", "Espanyol"));
		listaJugadores.add(new Jugador("Sergio", "Garc�a", "Espanyol"));
		listaJugadores.add(new Jugador("Esteban", "Granero", "Espanyol"));
		
		listaJugadores.add(new Jugador("David", "Soria", "Getafe"));
		listaJugadores.add(new Jugador("Jorge", "Molina", "Getafe"));
		listaJugadores.add(new Jugador("Samu", "S�iz", "Getafe"));
		listaJugadores.add(new Jugador("Francisco", "Portillo", "Getafe"));
		listaJugadores.add(new Jugador("Gaku", "Shibasaki", "Getafe"));
		
		listaJugadores.add(new Jugador("Gorka", "Iraizoz", "Girona"));
		listaJugadores.add(new Jugador("Pedro", "Porro", "Girona"));
		listaJugadores.add(new Jugador("Borja", "Garc�a", "Girona"));
		listaJugadores.add(new Jugador("Pere", "Pons", "Girona"));
		listaJugadores.add(new Jugador("Bernardo", "Espinosa", "Girona"));
		
		listaJugadores.add(new Jugador("Moi", "G�mez", "Huesca"));
		listaJugadores.add(new Jugador("David", "Ferreiro", "Huesca"));
		listaJugadores.add(new Jugador("Dami�n", "Musto", "Huesca"));
		listaJugadores.add(new Jugador("Enric", "Gallego", "Huesca"));
		listaJugadores.add(new Jugador("Gonzalo", "Melero", "Huesca"));
		
		listaJugadores.add(new Jugador("Iv�n", "Cu�llar", "Legan�s"));
		listaJugadores.add(new Jugador("Gerard", "Gumbau", "Legan�s"));
		listaJugadores.add(new Jugador("Sabin", "Merino", "Legan�s"));
		listaJugadores.add(new Jugador("Javier", "Avil�s", "Legan�s"));
		listaJugadores.add(new Jugador("Diego", "Reyes", "Legan�s"));
		
		listaJugadores.add(new Jugador("Antonio", "Luna", "Levante"));
		listaJugadores.add(new Jugador("Sergio", "Postigo", "Levante"));
		listaJugadores.add(new Jugador("Fran", "Manzanara", "Levante"));
		listaJugadores.add(new Jugador("Pedro", "L�pez", "Levante"));
		listaJugadores.add(new Jugador("Arturo", "Molina", "Levante"));
		
		listaJugadores.add(new Jugador("Miguel �ngel", "Morro", "Rayo Vallecano"));
		listaJugadores.add(new Jugador("Luis", "Meseguer", "Rayo Vallecano"));
		listaJugadores.add(new Jugador("Jos�", "Pozo", "Rayo Vallecano"));
		listaJugadores.add(new Jugador("Manuel", "Navarro", "Rayo Vallecano"));
		listaJugadores.add(new Jugador("Sergio", "Moreno", "Rayo Vallecano"));
		
		listaJugadores.add(new Jugador("Giovani", "Lo Celso", "Betis"));
		listaJugadores.add(new Jugador("Sergio", "Canales", "Betis"));
		listaJugadores.add(new Jugador("Cristian", "Tello", "Betis"));
		listaJugadores.add(new Jugador("Adri�n", "Tellado", "Betis"));
		listaJugadores.add(new Jugador("William", "Carvalho", "Betis"));
		
		listaJugadores.add(new Jugador("Diego", "Llorente", "Real Sociedad"));
		listaJugadores.add(new Jugador("Joseba", "Zaldua", "Real Sociedad"));
		listaJugadores.add(new Jugador("Alex", "Sola", "Real Sociedad"));
		listaJugadores.add(new Jugador("Mikel", "Oyarzabal", "Real Sociedad"));
		listaJugadores.add(new Jugador("Sandro", "Ram�rez", "Real Sociedad"));
		
		listaJugadores.add(new Jugador("Mois�s", "Delgado", "Valladolid"));
		listaJugadores.add(new Jugador("Roberto", "Corral", "Valladolid"));
		listaJugadores.add(new Jugador("Borja", "Fern�ndez", "Valladolid"));
		listaJugadores.add(new Jugador("Sergi", "Guardiola", "Valladolid"));
		listaJugadores.add(new Jugador("Kuki", "Zalazar", "Valladolid"));
		
		listaJugadores.add(new Jugador("Roque", "Mesa", "Sevilla"));
		listaJugadores.add(new Jugador("�ver", "Banega", "Sevilla"));
		listaJugadores.add(new Jugador("Jes�s", "Navas", "Sevilla"));
		listaJugadores.add(new Jugador("Andr�", "Silva", "Sevilla"));
		listaJugadores.add(new Jugador("Juan", "Berrocal", "Sevilla"));
		
		listaJugadores.add(new Jugador("Jos�", "Gay�", "Valencia"));
		listaJugadores.add(new Jugador("Carlos", "Soler", "Valencia"));
		listaJugadores.add(new Jugador("Kevin", "Gameiro", "Valencia"));
		listaJugadores.add(new Jugador("Rodrigo", "Moreno", "Valencia"));
		listaJugadores.add(new Jugador("Ezequiel", "Garay", "Valencia"));
		
		listaJugadores.add(new Jugador("Sergio", "Asenaio", "Villareal"));
		listaJugadores.add(new Jugador("Mariano", "Barbosa", "Villareal"));
		listaJugadores.add(new Jugador("Mario", "Gaspar", "Villareal"));
		listaJugadores.add(new Jugador("Manu", "Trigueros", "Villareal"));
		listaJugadores.add(new Jugador("Carlos", "Bacca", "Villareal"));
		
		
		
		
		
		
		
		//Creaci�n de Equipos
		
			ArrayList <Equipo> listaEquipos = new ArrayList <Equipo>();
				
				
			listaEquipos.add(new Equipo ("Barcelona"));
				
			listaEquipos.add(new Equipo("Real Madrid"));
				
			listaEquipos.add(new Equipo("Atl�tico de Madrid"));
				
			listaEquipos.add(new Equipo("Betis"));
				
			listaEquipos.add(new Equipo("Sevilla"));
				
			listaEquipos.add(new Equipo("Getafe"));
				
			listaEquipos.add(new Equipo("Valencia"));
				
			listaEquipos.add(new Equipo("Athletic Bilbao"));
				
			listaEquipos.add(new Equipo("Alav�s"));
				
			listaEquipos.add(new Equipo("Real Sociedad"));
				
			listaEquipos.add(new Equipo("Espanyol"));
				
			listaEquipos.add(new Equipo("Eibar"));
				
			listaEquipos.add(new Equipo("Legan�s"));
				
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
		
		
				

		//Men� del programa
		
		boolean funcionamiento;
		
		int opcion;
		
		
		do {
		
		
		
		try {
			
		funcionamiento = true;
		Scanner entrada = new Scanner (System.in);
		
				do {
			
			
			System.out.println("Qu� deseas realizar?");
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
				
				System.out.println("�Hasta pronto!");
				
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
