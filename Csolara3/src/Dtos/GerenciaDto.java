package Dtos;

import java.time.LocalDateTime;

public class GerenciaDto {

	LocalDateTime fechaAhora = LocalDateTime.now();
	public String nombre = "aaaaa";
	public int CantidadProducto = 0;
	public String FechaEntregaDeseada = "dd-MM-yyyy";
	public long ID = 0;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadProducto() {
		return CantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		CantidadProducto = cantidadProducto;
	}

	public String getFechaEntregaDeseada() {
		return FechaEntregaDeseada;
	}

	public void setFechaEntregaDeseada(String fechaEntregaDeseada) {
		FechaEntregaDeseada = fechaEntregaDeseada;
	}

	public long getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public LocalDateTime getFechaAhora() {
		return fechaAhora;
	}

	public void setFechaAhora(LocalDateTime fechaAhora) {
		this.fechaAhora = fechaAhora;
	}

	public GerenciaDto(LocalDateTime fechaAhora, String nombre, int cantidadProducto, String fechaEntregaDeseada,
			long iD) {
		super();
		this.fechaAhora = fechaAhora;
		this.nombre = nombre;
		CantidadProducto = cantidadProducto;
		FechaEntregaDeseada = fechaEntregaDeseada;
		ID = iD;
	}

	public GerenciaDto() {
		super();
	}

	@Override
	public String toString() {
		return "GerenciaDto [nombre=" + nombre + ", CantidadProducto=" + CantidadProducto + ", FechaEntregaDeseada="
				+ FechaEntregaDeseada + ", ID=" + ID + "]";
	}

}
