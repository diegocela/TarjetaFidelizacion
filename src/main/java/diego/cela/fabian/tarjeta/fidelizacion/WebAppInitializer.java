package diego.cela.fabian.tarjeta.fidelizacion;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer  {
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.setConfigLocation("diego.cela.fabian.tarjeta.fidelizacion.config");
		Dynamic servlet = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(webApplicationContext));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
	}

}
