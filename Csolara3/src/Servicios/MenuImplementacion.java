package Servicios;

import java.util.Scanner;
/**
 * Metodo que implementa la interfaz de la aplicacion.
 * CSL - 010324
 */
public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);

	public int MENU() 
	{
		int opcionseleccionada;

		System.out.println("########################");
		System.out.println("0. Cerrar aplicación.");
		System.out.println("1. Menu empleado.");
		System.out.println("2. Menu gerencia.");
		System.out.println("########################");

		opcionseleccionada = sc.nextInt();
		return opcionseleccionada;

	}

	public int EMPLEADO()
	{
		int opcionseleccionada;

		System.out.println("########################");
		System.out.println("0. Total ventas diarias.");
		System.out.println("1. Añadir venta.");		
		System.out.println("########################");

		opcionseleccionada = sc.nextInt();
		return opcionseleccionada;
	}
	
	public int GERENCIA()
	{
		int opcionseleccionada;

		System.out.println("########################");
		System.out.println("0. Total ventas del dia.");
		System.out.println("1. Crear nuevo pedido.");		
		System.out.println("########################");

		opcionseleccionada = sc.nextInt();
		return opcionseleccionada;
	}

}
