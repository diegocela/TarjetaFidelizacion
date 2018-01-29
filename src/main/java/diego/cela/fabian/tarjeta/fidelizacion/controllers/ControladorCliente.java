package diego.cela.fabian.tarjeta.fidelizacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import diego.cela.fabian.tarjeta.fidelizacion.dtos.Cliente;
import diego.cela.fabian.tarjeta.fidelizacion.services.ServicioCliente;

@Controller
@RequestMapping("/cliente")
public class ControladorCliente {
	
	//@Autowired
	//private ServicioCliente servicioCliente;
	
	@ModelAttribute("cliente")
	public Cliente cliente() {
		return new Cliente();
	}
	
	@RequestMapping(path="/alta", method=RequestMethod.GET)
	public String iniciarAltaCliente() {
		return "formularios/altaCliente";
	}
	
	@RequestMapping(path="/alta", method=RequestMethod.POST)
	public String altaCliente(@RequestBody Cliente cliente) {
		//servicioCliente.altaCliente(cliente);
		return "cliente";
	}

}
