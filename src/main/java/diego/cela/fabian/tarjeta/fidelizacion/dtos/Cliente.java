package diego.cela.fabian.tarjeta.fidelizacion.dtos;

public class Cliente extends Usuario {
	
	private String apellidos;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Cliente [apellidos=" + apellidos + ", username=" + username + ", password=" + password + ", nombre="
				+ nombre + "]";
	}
	
}
