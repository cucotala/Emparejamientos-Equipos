package jugadores;



public class Jugador {

	
	String nombre;
	
	String apellido;
	
	double ingenioBase;
	
	double rapidezBase;
	
	double rapidezFinal;
	
	double ingenioFinal;
	
	String equipo;
	
	double elo;
	
	
	String tipo;
	
	
		

	

	
	public Jugador (String nombre, String apellido, String equipo) {
		
		this.nombre = nombre;
		
		this.apellido = apellido;
		
		this.equipo = equipo;
		
		
		boolean estableceTipo = Math.random()<0.5;
		
		if (estableceTipo == true) {
			
			tipo = "Carry";
			
		}else {
			
			tipo = "Coach";
			
		}
		
		
		rapidezBase = Math.round((Math.random()*5)*100d) / 100d;

		
		ingenioBase = Math.round((Math.random()*5)*100d) / 100d;
	
		
		if (tipo == "Carry") {
			
			rapidezFinal = Math.round((rapidezBase * 2) * 100d) /100d;
			ingenioFinal = Math.round((ingenioBase * 0.5) * 100d) /100d;
			
		}
		
	
		
		if (tipo == "Coach") {
			
			rapidezFinal = Math.round((rapidezBase * 0.2) * 100d) /100d;
			ingenioFinal = Math.round((ingenioBase * 3) * 100d) /100d;
			
			
			
		}
		
		elo = Math.round((rapidezFinal + ingenioFinal) * 100d) /100d;
		
		
	}
		


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public double getIngenioBase() {
		return ingenioBase;
	}



	public void setIngenioBase(double ingenioBase) {
		this.ingenioBase = ingenioBase;
	}



	public double getRapidezBase() {
		return rapidezBase;
	}



	public void setRapidezBase(double rapidezBase) {
		this.rapidezBase = rapidezBase;
	}



	public double getRapidezFinal() {
		return rapidezFinal;
	}



	public void setRapidezFinal(double rapidezFinal) {
		this.rapidezFinal = rapidezFinal;
	}



	public double getIngenioFinal() {
		return ingenioFinal;
	}



	public void setIngenioFinal(double ingenioFinal) {
		this.ingenioFinal = ingenioFinal;
	}



	public String getEquipo() {
		return equipo;
	}



	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	


	public double getElo() {
		return elo;
	}




	public void setElo(double elo) {
		this.elo = elo;
	}

	
	
	
	
	


	public void mostrarJugador () {
		
		
		System.out.println("Nombre: " + nombre + "\nApellido: " + apellido +  "\nEquipo: " + equipo +   "\nRapidez: " + rapidezFinal + 
				"\tBase (" + rapidezBase + ")" +  "\nIngenio: " + ingenioFinal + "\tBase (" + ingenioBase + ")" +  "\nTipo: " + tipo + "\nELO: "+ elo);
		
		System.out.println();
		
		
		
	}
	
}
