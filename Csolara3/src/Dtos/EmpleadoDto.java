package Dtos;

import java.time.LocalDateTime;

public class EmpleadoDto {

	public LocalDateTime fechaAhora = LocalDateTime.now();
	public long ID = 0;
	public String importeVenta;

	public LocalDateTime getFechaAhora() {
		return fechaAhora;
	}

	public void setFechaAhora(LocalDateTime fechaAhora) {
		this.fechaAhora = fechaAhora;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getImporteVenta() {
		return importeVenta;
	}

	public void setImporteVenta(String importeVenta) {
		this.importeVenta = importeVenta;
	}

	public EmpleadoDto(LocalDateTime fechaAhora, long iD, String importeVenta) {
		super();
		this.fechaAhora = fechaAhora;
		ID = iD;
		this.importeVenta = importeVenta;
	}

	public EmpleadoDto() {
		super();
	}

	@Override
	public String toString() {
		return "EmpleadoDto [fechaAhora=" + fechaAhora + ", ID=" + ID + ", importeVenta=" + importeVenta + "]";
	}

}
