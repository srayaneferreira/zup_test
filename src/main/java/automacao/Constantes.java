package automacao;

import org.openqa.selenium.By;

public class Constantes {

	public String url = "https://www.submarino.com.br/";
	public By inputPesquisar = By.id("h_search-input");
	public By produtoSelecionado = By.className("as-name");
	public By bntComprar = By.id("btn-buy");
	public By bntContinuar = By.id("btn-continue");
	public By bntRemover = By.cssSelector(".basket-productRemoveAct");
	public By btnQuantidade = By.cssSelector(".basket-productQuantity__wrapper");
	public By descricao = By.cssSelector(".basket-productInfo__wrapper");
	public By descricaoProd = By.id("product-name-default");
	public By msgCarrinhoVazio = By.cssSelector(".basket-products");
	public By valorDescPedido = By.cssSelector(".basket-productPrice__wrapper");
	public String valorEsperado = "R$ 89.980,00";
}
