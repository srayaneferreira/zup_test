#language:pt
@ProdutoSariva
Funcionalidade: Buscar produto na Saraiva
  O caso de teste tem o objetivo de buscar e adicionar um produto no carrinho de compras
  e validar o objetivo.

  Contexto: 
    Dado que eu acesse o site da Submarino
    E efetue a busca por um produto no campo de pesquisa
    Quando selecionar o produto desejado
    E adicionar o produto no carrinho de compras

  @adicionarProduto
  Cenario: Adicionar produto no carrinho de compra
    Entao validar se o produto se encontra no carrinho de compras

  @deletarProduto
  Cenario: Deletar produto no carrinho de compra
    E deletar o produto adicionado no carrinho
    Entao o sistema deve mostrar alerta

  @adicionarMaisItensDoProduto
  Cenario: Adicionar mai de um item do produto no carrinho de compra
    E adicionar mais de um item
    Entao deve conter dois itens no carrinho do mesmo produto
