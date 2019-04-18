package personas;



public class Cliente extends Persona {

	//atributos
	
	private double dineroGastado;
	private String tipo = "normal";
	
		
	
	
	//constructores
	
	public Cliente(String dni) {
		super (dni);
	}
	
		
	public Cliente(String dni, String nombre) {
		
		super(dni, nombre);
		
	}
	
	
	public Cliente(String dni, String nombre, String direccion) {
		
		super(dni, nombre, direccion);
		
	}
	
	
	public Cliente(String dni, String nombre, String direccion, String tipo) {
		
		super(dni, nombre, direccion);
		
		this.tipo=tipo;
		
	}
	
	public Cliente(String dni, String nombre, String direccion, String tipo, double dineroGastado) {
		
		super(dni, nombre, direccion);
		
		this.tipo=tipo;
		
		this.dineroGastado=dineroGastado;
		
		
	}
	
	public Cliente(Cliente c1) {
		
		super(c1);
		
		tipo=c1.tipo;
		
		dineroGastado=c1.dineroGastado;
		
		
		
	}
	
	
	//getters y setters
	
	public double getDineroGastado() {
		return dineroGastado;
	}


	public void setDineroGastado(double dineroGastado) {
		this.dineroGastado = dineroGastado;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		
		this.tipo = tipo;
	
		
		
	}

	

	//metodos
	
	public void aumentarGasto(double cantidad) {
		
		dineroGastado+=cantidad;
		
	}
	
	public void disminuirGasto(double cantidad) {
		
		dineroGastado-=cantidad;
		
		if (getDineroGastado()<100) {
			setTipo("normal");
		}
			
		
		
	}
	
	
	public void mostrarCliente() {
		
		super.mostrarPersona();
		System.out.println("Dinero gastado: " + getDineroGastado());
		System.out.println("Tipo: " + getTipo() + "\n");
	}
	
			

	
}

