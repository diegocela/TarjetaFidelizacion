package diego.cela.fabian.tarjeta.fidelizacion.services;

import org.springframework.stereotype.Service;

import diego.cela.fabian.tarjeta.fidelizacion.dtos.Operador;

@Service
public interface ServicioOperador {
	
	public void altaOperador(Operador operador);

}
