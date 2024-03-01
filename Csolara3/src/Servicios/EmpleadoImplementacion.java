package Servicios;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dtos.EmpleadoDto;

/**
 * Metodo que implementa la intrfaz del empleado.
 * CSL - 010324
 */
public class EmpleadoImplementacion implements EmpleadoInterfaz {
	
	List<EmpleadoDto> listaEmpleado = new ArrayList<>();

	private long ID(List<EmpleadoDto> listaEmpleado) {

		long ID;
		int tamanoLista = listaEmpleado.size();
		if (tamanoLista == 0) {
			ID = 1;
		} else {
			ID = listaEmpleado.get(tamanoLista + 1).getID();
		}
		return ID;
	}
	
	public void AñadirVenta() {
		EmpleadoDto listaEmpleado = new EmpleadoDto();
		Scanner sc = new Scanner(System.in);
		
		long ID = ID(listaEmpleado);
		LocalDateTime fechaAhora = LocalDateTime.now();
		System.out.println("Introduzca importe de la venta: ");
		listaEmpleado.importeVenta = sc.next();
		
	}		
	
	public void TotalVentasDiarias() {
		Scanner sc = new Scanner(System.in);
		
	}
	
}
