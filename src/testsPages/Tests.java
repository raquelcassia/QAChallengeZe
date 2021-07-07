package testsPages;

import org.junit.Before;
import org.junit.Test;

import utils.WebDriverUtils;
import zeDeliveryPages.AddressPage;
import zeDeliveryPages.LoginPage;

public class Tests {
	
	private static LoginPage login;
	private static AddressPage Address;
	
	@Before
	public void precondicao() {
		WebDriverUtils.Iniciar();
		
		login = new LoginPage();
		Address = new AddressPage();
	}
	
	@Test
	public void fluxoDeCompra() throws Throwable {
		
		login.paginaInicial();
		login.loginCompleto("","");
		Thread.sleep(3000);
		Address.alterarEndereco("estrada de jacarepagua 7655"); 
	}
}