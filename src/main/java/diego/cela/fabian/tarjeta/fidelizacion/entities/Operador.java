package diego.cela.fabian.tarjeta.fidelizacion.entities;

public class Operador extends Usuario {

	private String cif;
	
	public Operador() {
		super();
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}
	
	@Override
	public String toString() {
		return "Operador [cif=" + cif + ", login=" + login + ", password=" + password + ", nombre=" + nombre + "]";
	}

}
