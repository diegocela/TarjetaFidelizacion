package diego.cela.fabian.tarjeta.fidelizacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import diego.cela.fabian.tarjeta.fidelizacion.dtos.Operador;
import diego.cela.fabian.tarjeta.fidelizacion.services.ServicioOperador;

@Controller
@RequestMapping("/operador")
public class ControladorOperador {
	
	@Autowired
	private ServicioOperador servicioOperador;
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	public void altaOperador(@RequestBody Operador operador) {
		
	}

}
