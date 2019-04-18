package personas;

public class Persona {

	
	//atributos
	
	private String direccion="";
	private String dni="";
	private String nombre="";
	
	
	//constructores
	
	public Persona(String dni) {
		
		this.dni=dni;
		
	}
	
	public Persona(String dni, String nombre) {
		
		this.dni=dni;
		
		this.nombre=nombre;
		
	}
	
	public Persona(String dni, String nombre, String dir) {
		
		this.dni=dni;
		
		this.nombre=nombre;
		
		direccion=dir;
		
	}
	
	public Persona(Persona per1) {
		
		dni=per1.dni;
		
		nombre=per1.nombre;
		
		direccion=per1.direccion;
	}

	
	//getter y setter
	
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//metodos
	
	public void mostrarPersona() {
		
		System.out.println("DNI: " + getDni());
		System.out.println("Nombre: " + getNombre());
		System.out.println("Direccion: " + getDireccion());
		
	}
	
	
}
