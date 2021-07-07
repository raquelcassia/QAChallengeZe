package zeDeliveryPages;

import org.openqa.selenium.By;

import utils.WebDriverUtils;

public class AddressPage {
	
	public void opcaoReceberAgora() {
		WebDriverUtils.driver.findElement(By.id("delivery-options-card")).click();
	}
	
	public void opcaoAlterarMeuEndereco() {
		WebDriverUtils.driver.findElement(By.id("delivery-options-tool-tip-address")).click();
	}
	
	public void buscarNovoEndereco(String novoendereco) {
		WebDriverUtils.driver.findElement(By.id("address-search-input-address")).sendKeys(novoendereco);
	}
	
	public void selecionarNovoEnderecoCorreto() {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div/div[1]/aside/div/ul/li[1]")).click();
	}
	
	public void selecionarCheckboxSemComplemento() {
		WebDriverUtils.driver.findElement(By.id("address-details-checkbox-without-complement")).click();
	}
	
	public void botaoVerProdutosDisponiveis() {
		WebDriverUtils.driver.findElement(By.id("address-details-button-continue")).click();
	}
	
	public void alterarEndereco(String novoendereco) {
		opcaoReceberAgora();
		opcaoAlterarMeuEndereco();
		buscarNovoEndereco(novoendereco);
		selecionarNovoEnderecoCorreto();
		selecionarCheckboxSemComplemento();
		botaoVerProdutosDisponiveis();
	}

}
