package Controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dtos.EmpleadoDto;
import Dtos.GerenciaDto;
import Servicios.EmpleadoImplementacion;
import Servicios.EmpleadoInterfaz;
import Servicios.GerenciaImplementacion;
import Servicios.GerenciaInterfaz;
import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;

public class index {
/**
 * Clase principal de la aplicacion.
 * CSL - 010324
 * @param args
 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<EmpleadoDto> listaEmpleado = new ArrayList<>();
		List<GerenciaDto> listaGerencia = new ArrayList<>();

		EmpleadoInterfaz ei = new EmpleadoImplementacion();
		GerenciaInterfaz gi = new GerenciaImplementacion();
		MenuInterfaz mi = new MenuImplementacion();

		boolean cerrarMenu = false;

		while (!cerrarMenu) {

			int recogido = mi.MENU();

			switch (recogido) {

			case 0:
				System.out.println("La aplicacion se cerrara.");
				cerrarMenu = true;
				break;
			case 1:
				int recogido1 = mi.EMPLEADO();
				switch (recogido1) {
				case 0:
					ei.TotalVentasDiarias();
					break;
				case 1:
					ei.AñadirVenta();
					break;
				default:
					System.out.println("La opcion que ha seleccionado no coincide.");
					break;
				}
				break;
			case 2:
				int recogido2 = mi.GERENCIA();
				switch (recogido2) {
				case 0:
					gi.TotalVentasDia();
					break;
				case 1:
					gi.CrearNuevoPedido();
					break;
				default:
					System.out.println("La opcion que ha seleccionado no coincide.");
					break;
				}
				break;
			default:
				System.out.println("La opcion que ha seleccionado no coincide.");
				break;

			}

		}

	}

}
