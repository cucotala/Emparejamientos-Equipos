package tienda;

import tienda.Venta;

import java.util.Scanner;

import alamcen.Producto;
import personas.Cliente;


public class UsoPrograma {

	

	public static void main(String[] args) {

		
		Cliente c1 = new Cliente ("46542655B", "Francisco Fernández Fonseca", "Calle Don Quijote Nº3 2ºA", "normal", 0.0);
		
		Cliente c2 = new Cliente ("01297532B", "Dolores Díaz Delgado", "Plaza San Andrés Nº23");
		
		Producto p1 = new Producto ("Televisión", 400.60, 1);
		
		Producto p2 = new Producto ("Película Blu-Ray", 12.50, 3);
		
		
		
		Venta v1 = new Venta("0001", c1, p1,500);
		
		Venta v2 = new Venta("0002", c2, p1,500);
		
		Venta v3 = new Venta("0003", c1, p2,25);
		
		Venta v4 = new Venta("0004", c2, p2,25);
		
		
		
		
				
		int opcion;
		Scanner entrada = new Scanner(System.in);
		do {
		
		System.out.println("¿Qué acción quieres realizar?");
		System.out.println("(1) Mostar ventas realizadas");
		System.out.println("(2) Comprobar dinero gastado por cliente");
		System.out.println("(3) Comprobar dinero total logrado por ventas");
		System.out.println("(4) Salir");
		
		
		 opcion = entrada.nextInt();	
				
			
			switch (opcion) {
		
		
		
		case 1:
			
			System.out.println("¿Qué venta quieres comprobar?");
			System.out.println("(1) Venta 1");
			System.out.println("(2) Venta 2");
			System.out.println("(3) Venta 3");
			System.out.println("(4) Venta 4");
				
				int opcionCase1 = entrada.nextInt();
				
					if (opcionCase1==1) {
						
						v1.mostrarVenta();
						
					}else if (opcionCase1==2) {
						
						v2.mostrarVenta();
						
					}else if (opcionCase1==3) {
						
						v3.mostrarVenta();
						
					}else if (opcionCase1==4) {
						
						v4.mostrarVenta();
						
					}
						
			break;
		
		case 2:	
			
			System.out.println("¿Qué cliente quieres comprobar?");
			System.out.println("(1) Cliente 1");
			System.out.println("(2) Cliente 2");
			
				int opcionCase2 = entrada.nextInt();
			
					if (opcionCase2==1) {
						
						c1.mostrarCliente();
						
					}else if (opcionCase2==2) {
						
						c2.mostrarCliente();
						
					}
					
			break;
			
		
		case 3:
			
			
			
			
			System.out.println("Dinero total logrado por todas las ventas: " + Venta.getTotalVentas() );
			
			
			break;
			
			
		case 4:
			
			System.out.println("¡Hasta pronto!");
			
			
			break;
		
			

		}		
		
			
		
		}while (opcion!=4);
		
		
		entrada.close();
		
			
		
			
		}
			
		
	}


