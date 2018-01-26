package diego.cela.fabian.tarjeta.fidelizacion.dtos;

public class Operador extends Usuario {
	
private String cif;
	
	private String web;
	
	private String factorConversion;
	
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

	public String getFactorConversion() {
		return factorConversion;
	}

	public void setFactorConversion(String factorConversion) {
		this.factorConversion = factorConversion;
	}

}
