package diego.cela.fabian.tarjeta.fidelizacion.entities;

public class Operador extends Cliente {

	private String cif;
	
	private String web;
	
	private int factorConversion;
	
	private int idTipo;
	
	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public int getFactorConversion() {
		return factorConversion;
	}

	public void setFactorConversion(int factorConversion) {
		this.factorConversion = factorConversion;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
}
