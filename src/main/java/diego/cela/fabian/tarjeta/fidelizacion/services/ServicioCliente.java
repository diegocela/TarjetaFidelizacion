package diego.cela.fabian.tarjeta.fidelizacion.services;

import org.springframework.stereotype.Service;

import diego.cela.fabian.tarjeta.fidelizacion.dtos.Cliente;

@Service
public interface ServicioCliente {
	
	public void altaCliente(Cliente cliente);
	
	public void consultaPuntos();
	
	public void consultaOfertas();
	
	public void consultaReservas();

}
