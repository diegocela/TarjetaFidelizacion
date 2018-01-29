package diego.cela.fabian.tarjeta.fidelizacion.dtos;

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
		return "Operador [cif=" + cif + ", username=" + username + ", password=" + password + ", nombre=" + nombre
				+ "]";
	}

}
