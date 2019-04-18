package equipos;

import java.util.ArrayList;

import jugadores.Jugador;

public class Equipo {
	
	
	

	String nombre;
	
		
	ArrayList <Jugador>  plantilla = new ArrayList <Jugador>(); 
	
	double elo;
	
	
	public Equipo (String nombre) { 
		
		this.nombre = nombre;
		
	}
		
	
	
	public void infoEquipo() {
		
		System.out.println(nombre + "\tELO: " + Math.round((elo)* 100d) / 100d);
		
		
	}
	
	
	public void anadirJugador (Jugador integrante) {
		
		plantilla.add(integrante);
		this.elo += integrante.getElo();
		
		
	}
	
	
	




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public ArrayList<Jugador> getPlantilla() {
		return plantilla;
	}



	public void setPlantilla(ArrayList<Jugador> plantilla) {
		this.plantilla = plantilla;
	}



	public double getElo() {
		return Math.round((elo) *100d) /100d;
	}



	public void setElo(double elo) {
		this.elo = elo;
	}

	

	
	
	
}
