package diego.cela.fabian.tarjeta.fidelizacion.services;

import diego.cela.fabian.tarjeta.fidelizacion.dtos.Cliente;
import diego.cela.fabian.tarjeta.fidelizacion.dtos.Operador;

public interface Servicio {
	
	public void altaCliente(Cliente cliente);
	
	public void altaOperador(Operador operador);
	
	public void consultaPuntos(Cliente cliente);
	
	public void consultaOfertas();
	
	public void consultaReservas(Cliente cliente);
	
	public void bonificar(Cliente cliente, int puntos);
}
