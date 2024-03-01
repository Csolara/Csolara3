package Servicios;

import java.util.List;
import java.util.Scanner;

import Dtos.GerenciaDto;

/**
 * Metodo que implementa la interfaz de la gerencia.
 * CSL - 010324
 */
public class GerenciaImplementacion implements GerenciaInterfaz {

	private long ID(List<GerenciaDto> listaGerencia) {

		long ID;
		int tamanoLista = listaGerencia.size();
		if (tamanoLista == 0) {
			ID = 1;
		} else {
			ID = listaGerencia.get(tamanoLista + 1).getID();
		}
		return ID;
	}

	public void TotalVentasDia() {
		GerenciaDto listaGerencia = new GerenciaDto();
		Scanner sc = new Scanner(System.in);

		long ID = listaGerencia.ID;
		
		System.out.print("============================");
		System.out.print("Venta numero: " + listaGerencia.ID);
		System.out.print("Euros: X euros");
		System.out.print("Instante de compra: " + listaGerencia.getFechaAhora());
		System.out.print("============================");

	}

	public void CrearNuevoPedido() {

		GerenciaDto listaGerencia = new GerenciaDto();
		Scanner sc = new Scanner(System.in);

		System.out.println("Indique el nombre del producto: ");
		listaGerencia.nombre = sc.next();
		System.out.println("Introduze la cantidad del producto: ");
		listaGerencia.CantidadProducto = sc.nextInt();
		System.out.println("Introduze la fecha deseada de entrega(dd-MM-yyyy): ");
		listaGerencia.FechaEntregaDeseada = sc.next();

		System.out.println("============================");
		System.out.println("Producto: " + listaGerencia.nombre);
		System.out.println("Cantidad: " + listaGerencia.CantidadProducto);
		System.out.println("Fecha entrega: " + listaGerencia.FechaEntregaDeseada);
		System.out.println("============================");

	}

}
