package diego.cela.fabian.tarjeta.fidelizacion.entities;

import java.util.Date;

public class Oferta {
	
private int id;
	
	private int idOperador;
	
	private Date fechaInicio;
	
	private Date fechaFin;
	
	private int coste;
	
	private String lugarInicio;
	
	private String lugarFin;
	
	private String descripcion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdOperador() {
		return idOperador;
	}

	public void setIdOperador(int idOperador) {
		this.idOperador = idOperador;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getCoste() {
		return coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}

	public String getLugarInicio() {
		return lugarInicio;
	}

	public void setLugarInicio(String lugarInicio) {
		this.lugarInicio = lugarInicio;
	}

	public String getLugarFin() {
		return lugarFin;
	}

	public void setLugarFin(String lugarFin) {
		this.lugarFin = lugarFin;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
