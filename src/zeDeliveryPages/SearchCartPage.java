package zeDeliveryPages;

import org.openqa.selenium.By;

import utils.WebDriverUtils;

public class SearchCartPage {

	public void selecionarIconeProduto() {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div/div/div[6]/div[3]/div/a[2]/div/div[1]/img")).click();
	}
	
	public void inserirBuscaProduto(String nomeproduto) {
		WebDriverUtils.driver.findElement(By.id("search-product-input")).sendKeys(nomeproduto);
	}
	
	public void selecionarRetornoItemBusca() {
		WebDriverUtils.driver.findElement(By.xpath("/html/body/div/div/header/div/div/div[2]/div[2]/div[2]/ul/li[1]/div")).click();
	}
	
	public void botaoMaisItens() {
		WebDriverUtils.driver.findElement(By.id("plus-button")).click();
	}
	
	public void botaoAddProduto() {
		WebDriverUtils.driver.findElement(By.id("add-product")).click();
	}
	
	public void opcaoAddMaisProdutos() {
		WebDriverUtils.driver.findElement(By.id("add-more-products")).click();
	}
	
	public void opçãoExcluirQntProduto() {
		WebDriverUtils.driver.findElement(By.id("product-minus-button")).click();
	}
	
	
	
	public void inserindoProdutosSacola(String nomeproduto) {
		inserirBuscaProduto(nomeproduto);
		selecionarRetornoItemBusca();
		botaoMaisItens();
		botaoAddProduto();
		//opcaoAddMaisProdutos();
		opçãoExcluirQntProduto();
	}
}
