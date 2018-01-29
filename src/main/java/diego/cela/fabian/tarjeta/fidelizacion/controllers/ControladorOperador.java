package diego.cela.fabian.tarjeta.fidelizacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import diego.cela.fabian.tarjeta.fidelizacion.dtos.Operador;
import diego.cela.fabian.tarjeta.fidelizacion.dtos.Usuario;
import diego.cela.fabian.tarjeta.fidelizacion.services.ServicioOperador;

@Controller
@RequestMapping("/operador")
public class ControladorOperador {
	
	//@Autowired
	//private ServicioOperador servicioOperador;
	
	@ModelAttribute("operador")
	public Operador operador() {
		return new Operador();
	}
	
	@RequestMapping(path="/alta", method=RequestMethod.GET)
	public String iniciarAltaOperador() {
		return "formularios/altaOperador";
	}
	
	@RequestMapping(path="/alta", method=RequestMethod.GET, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String altaOperador(@RequestBody Operador operador) {
		//servicioOperador.altaOperador(operador);
		return "operador";
	}

}
