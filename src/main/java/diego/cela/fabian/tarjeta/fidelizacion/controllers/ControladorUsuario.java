package diego.cela.fabian.tarjeta.fidelizacion.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import diego.cela.fabian.tarjeta.fidelizacion.dtos.Usuario;
import diego.cela.fabian.tarjeta.fidelizacion.services.ServicioUsuario;

@Controller
public class ControladorUsuario {
	
	@Autowired
	private ServicioUsuario servicioUsuario;
	
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String iniciarLogin(Map<String, Object> model) {
		return "login";
	}
	
	@RequestMapping(path="/formulario", method=RequestMethod.POST)
	public String procesarLogin(@ModelAttribute Usuario usuario) {
		return "formulario";
	}

}
