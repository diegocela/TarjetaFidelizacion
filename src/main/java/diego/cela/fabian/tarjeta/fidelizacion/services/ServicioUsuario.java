package diego.cela.fabian.tarjeta.fidelizacion.services;

import org.springframework.stereotype.Service;

import diego.cela.fabian.tarjeta.fidelizacion.dtos.Usuario;

@Service
public interface ServicioUsuario {
	
	public void loginUsuario(Usuario usuario);
	
}
