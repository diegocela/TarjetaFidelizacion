package diego.cela.fabian.tarjeta.fidelizacion.entities;

public class Cliente extends Usuario {

	private String apellidos;
	
	private int puntos;
	
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
}
