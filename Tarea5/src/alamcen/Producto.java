package alamcen;


public class Producto {
	
	
	//atributos
	
	private String nombre;
	private double precio;
	private int stock;
		
	
	//constructores
	
	public Producto(String nomProducto) {
		
		nombre=nomProducto;
		
	}
	
	public Producto(String nomProducto, double precProducto) {
		
		nombre=nomProducto;
		
		precio=precProducto;
	}
	
	public Producto(String nomProducto, double precProducto, int stock) {
		
		nombre=nomProducto;
		
		precio=precProducto;
		
		this.stock=stock;
		
	}

	public Producto (Producto p1) {
		
		nombre=p1.nombre;
		
		precio=p1.precio;
		
		stock=p1.stock;
		
	}
	
	
	//metodos
	
	public  void incrementarStock (int cantidad) {
		
		stock+=cantidad;
		
	}
	
	
	public void disminuirStock (int cantidad) {
		
		stock-=cantidad;
	}
	
	public void mostrarProducto () {
		
		System.out.println("Producto: " + getNombre());
		System.out.println("Precio: " + getPrecio());
		System.out.println("Stock: " + getStock() + "\n");
		
	}
	
	
	// getter y setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
		
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
			
}
