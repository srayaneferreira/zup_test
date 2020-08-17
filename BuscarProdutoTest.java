package testes;

import org.junit.Test;
import automacao.DriverFactory;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import pages.BuscarProdutoPage;
import report.JUnitHTMLReporter;

public class BuscarProdutoTest extends JUnitHTMLReporter {

	BuscarProdutoPage buscarProdutoPage = new BuscarProdutoPage();

	@Test
	@Dado("^que eu acesse o site da Submarino$")
	public void que_eu_acesse_o_site_da_Saraiva() throws Throwable {
		 buscarProdutoPage.acessarSite();
	}

	@Dado("^efetue a busca por um produto no campo de pesquisa$")
	public void efetue_a_busca_por_um_produto_no_campo_de_pesquisa() throws Throwable {
		buscarProdutoPage.buscarProduto();
	}

	@Quando("^selecionar o produto desejado$")
	public void selecionar_o_produto_desejado() throws Throwable {
		buscarProdutoPage.selecionarProduto();
	}

	@Quando("^adicionar o produto no carrinho de compras$")
	public void adicionar_o_produto_no_carrinho_de_compras() throws Throwable {
		buscarProdutoPage.adicionarProduto();
	}

	@Entao("^validar se o produto se encontra no carrinho de compras$")
	public void validar_se_o_produto_se_encontra_no_carrinho_de_compras() throws Throwable {
		buscarProdutoPage.validarCarrinho();
	}

	@Quando("^deletar o produto adicionado no carrinho$")
	public void deletar_o_produto_adicionado_no_carrinho() throws Throwable {
		buscarProdutoPage.removerProduto();
	}

	@Entao("^o sistema deve mostrar alerta$")
	public void o_sistema_deve_mostrar_alerta(String arg1) throws Throwable {
		buscarProdutoPage.alertaCarrinhoVazio();
	}

	@Quando("^adicionar mais de um item$")
	public void adicionar_mais_de_um_item() throws Throwable {
		buscarProdutoPage.adicionarItem();
	}

	@Entao("^deve conter dois itens no carrinho do mesmo produto$")
	public void deve_conter_dois_itens_no_carrinho_do_mesmo_produto() throws Throwable {
		buscarProdutoPage.qntEsperada();
	}

	public void finaliza() {
		DriverFactory.killDriver();
	}
}
