package pages;

import static automacao.DriverFactory.getDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import automacao.Constantes;

public class BuscarProdutoPage {

	Constantes constante = new Constantes();
	String descricaoEsperada;
	String qntEsperada;

	// Fluxo Basico Adicionar produto no carrinho
	public void acessarSite() throws InterruptedException {
		getDriver().get(constante.url);
		getDriver().manage().window().maximize();
		Thread.sleep(3000);
	}

	public void buscarProduto() throws InterruptedException {
		Thread.sleep(1000);
		getDriver().findElement(constante.inputPesquisar).click();
		Thread.sleep(3000);
		getDriver().findElement(constante.inputPesquisar).sendKeys("iphone");
		Thread.sleep(3000);
	}

	public void selecionarProduto() throws InterruptedException {
		getDriver().findElement(constante.produtoSelecionado).click();
		Thread.sleep(10000);
		// Guardar descrição do produto selecionado
		descricaoEsperada = getDriver().findElement(constante.descricaoProd).getText();
	}

	public void adicionarProduto() throws InterruptedException {
		// Adicionar produto desejado no carrinho
		getDriver().findElement(constante.bntComprar).click();
		Thread.sleep(3000);
		getDriver().findElement(constante.bntContinuar).click();
		Thread.sleep(10000);

	}

	public void validarCarrinho() throws InterruptedException {
		// Conferir se o produto adicionado é o correspondente
		Thread.sleep(10000);
		String descricaoProduto = getDriver().findElement(constante.descricao).getText();
		if (descricaoProduto.contains(descricaoEsperada)) {
			System.out.println("O produto é o mesmo!");
		}
	}

	// Fluxo Alternativo Remover Produto do Carrinho
	public void removerProduto() throws InterruptedException {
		// Remover item do carrinho
		getDriver().findElement(constante.bntRemover).click();
		Thread.sleep(1000);

	}

	public void alertaCarrinhoVazio() {
		// Validar se o carrinho está vazio
		String mensagem = getDriver().findElement(constante.msgCarrinhoVazio).getText();
		System.out.println(mensagem);
		if (mensagem.contains("Seu carrinho está vazio")) {
			System.out.println("O carrinho está vazio");
		}
	}

	// Fluxo Alternativo Adicionar outros itens do mesmo produto do Carrinho
	public void adicionarItem() throws InterruptedException {
		Actions action = new Actions(getDriver());
		// Adicionar outro item do mesmo produto no carrinho
		getDriver().findElement(constante.btnQuantidade).click();
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ENTER).build().perform();
		;
		Thread.sleep(5000);
		qntEsperada = getDriver().findElement(constante.valorDescPedido).getText();
		System.out.println(qntEsperada);

	}

	public void	qntEsperada() throws InterruptedException {
		// Verificar se foi adicionado outro item
				if (qntEsperada.contains(constante.valorEsperado)) {
					System.out.println("Foi adicionado outro item");
					Thread.sleep(5000);
				}
	}
}
