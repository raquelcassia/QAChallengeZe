package zeDeliveryPages;

import org.openqa.selenium.By;

import utils.WebDriverUtils;

public class LoginPage {
	
	public void botaomais18() {
		WebDriverUtils.driver.findElement(By.id("age-gate-button-yes")).click();;
	}
	
	/*public void aceitarCookies() {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div[2]/div/button")).click();
	}*/
	
	public void botaoEntrar() {
		WebDriverUtils.driver.findElement(By.id("welcome-button-sign-in")).click();
	}
	
	public void inserirEmail (String email) {
		WebDriverUtils.driver.findElement(By.id("login-mail-input-email")).sendKeys(email);
	}
	
	public void inserirSenha (String senha) {
		WebDriverUtils.driver.findElement(By.id("login-mail-input-password")).sendKeys(senha);
	}
	
	public void botaoConfirmarLogin () {
		WebDriverUtils.driver.findElement(By.id("login-mail-button-sign-in")).click();
	}
	
	public void paginaInicial() {
		
		botaomais18();	
	}
	
	
	public void loginCompleto(String email, String senha) {
		botaoEntrar();
		inserirEmail(email);
		inserirSenha(senha);
		botaoConfirmarLogin();	
	}
	
	
}
