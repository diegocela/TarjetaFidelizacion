package diego.cela.fabian.tarjeta.fidelizacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import diego.cela.fabian.tarjeta.fidelizacion.dtos.Usuario;
import diego.cela.fabian.tarjeta.fidelizacion.services.ServicioUsuario;

@Controller
@RequestMapping("/usuario")
public class ControladorUsuario {
	
	//@Autowired
	//private ServicioUsuario servicioUsuario;
	
	@ModelAttribute("usuario")
	public Usuario usuario() {
		return new Usuario();
	}
	
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String iniciarLogin() {
		return "formularios/login";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String loginUsuario(@ModelAttribute Usuario usuario) {
		//servicioUsuario.loginUsuario(usuario);
		return null;
	}

}
