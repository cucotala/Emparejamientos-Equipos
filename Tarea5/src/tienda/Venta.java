package tienda;

import alamcen.Producto;
import personas.Cliente;

public class Venta {

	
	//atributos
	
	private static double totalVentas;
	private Cliente clienteComprador;
	private Producto productoVendido;
	private String numFactura;
	private double precioVenta;
	
	private boolean comprobadorVenta;
	
	
	//constructores
	
	public Venta (String numFactura, Cliente cliente, Producto producto, double precioVenta) {
		
		
		this.numFactura=numFactura; 
		clienteComprador=cliente;
		productoVendido=producto;
		this.precioVenta=precioVenta;
		
		
		if(productoVendido.getStock() < 1) {
			
			System.out.println("¡No hay stock disponible!");
			System.out.println("------------------------------------------");
			precioVenta=0;
			setComprobadorVenta(false);
			
			
		}else{
		
		
		if (clienteComprador.getTipo().equals("VIP")) {
			
			disminuirPrecioVenta(0.15);
						
			System.out.println("Has obtenido un 15% de descuento por ser cliente VIP");
			System.out.println("------------------------------------------");
			
			
			
			productoVendido.disminuirStock(1);
			setComprobadorVenta(true);
			
			
			
		}
		
		
		
		 if (clienteComprador.getTipo().equals("normal")) {
		
			Venta.totalVentas +=precioVenta;
			clienteComprador.aumentarGasto(precioVenta);
			productoVendido.disminuirStock(1);
			setComprobadorVenta(true);
			
			
			if(clienteComprador.getDineroGastado() >=100) {
			System.out.println("¡ENHORABUENA! ¡Ya eres cliente VIP!, en tu próxima compra obtienes un 15% de descuento");
			System.out.println("------------------------------------------");
			clienteComprador.setTipo("VIP");
				}else {
					System.out.println("Gracias por su compra");
					System.out.println("------------------------------------------");
				}
		 	}
		 
		 
		}
		
		
	}
		
	
	
	
	//getters y setters
	
	
	public boolean getComprobadorVenta() {
		return comprobadorVenta;
	}
	public void setComprobadorVenta(boolean comprobadorVenta) {
		this.comprobadorVenta=comprobadorVenta;
	}
	
	
	public static double getTotalVentas() {
		return Venta.totalVentas;
	}
	public void setTotalVentas(double totalVentas) {
		Venta.totalVentas = totalVentas;
	}
	public Cliente getClienteComprador() {
		return clienteComprador;
	}
	public void setClienteComprador(Cliente clienteComprador) {
		this.clienteComprador = clienteComprador;
	}
	public Producto getProductoVendido() {
		return productoVendido;
	}
	public void setProductoVendido(Producto productoVendido) {
		this.productoVendido = productoVendido;
	}
	public String getNumFactura() {
		return numFactura;
	}
	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	
	//metodos
	
	public void disminuirPrecioVenta(double cantidad) {
		
		
				
		precioVenta-=precioVenta*cantidad;
		Venta.totalVentas+=precioVenta;
		clienteComprador.aumentarGasto(precioVenta);
		
		
		
	}
	
	public void  devolucionVenta () {
		
		clienteComprador.disminuirGasto(precioVenta);
		productoVendido.incrementarStock(1);
		Venta.totalVentas-=precioVenta;
		
		if (clienteComprador.getDineroGastado()<100) {
			System.out.println("¡Lo sentimos! Dedido a la devolución ya no eres cliente VIP");
			System.out.println("------------------------------------------");
			clienteComprador.setTipo("normal");
		}	
		
	}
	
	public void mostrarVenta() {
		
		if (getComprobadorVenta()==true) {
		
		System.out.println("Nº Factura: " + numFactura + "\n");
		clienteComprador.mostrarCliente();
		productoVendido.mostrarProducto();
		System.out.println("Precio de Venta: " + precioVenta);
		System.out.println("------------------------------------------");
		}else {
			
			System.out.println("¡Lo sentimos! La venta no se realizó porque no habia stock del producto");
			System.out.println("------------------------------------------");
			
		}
		
	}
				
	
	
}
