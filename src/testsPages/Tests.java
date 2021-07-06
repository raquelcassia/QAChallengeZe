package testsPages;

import org.junit.Before;
import org.junit.Test;

import utils.WebDriverUtils;
import zeDeliveryPages.PageLogin;

public class Tests {
	
	private static PageLogin login;
	
	@Before
	public void precondicao() {
		WebDriverUtils.Iniciar();
		
		login = new PageLogin();
	}
	
	@Test
	public void fluxoDeCompra() throws Throwable {
		
		login.paginaInicial();
		login.loginCompleto("",""); 
	}
}