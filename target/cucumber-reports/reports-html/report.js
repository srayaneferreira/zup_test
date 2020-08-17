$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("buscarProduto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 3,
  "name": "Buscar produto na Saraiva",
  "description": "O caso de teste tem o objetivo de buscar e adicionar um produto no carrinho de compras\r\ne validar o objetivo.",
  "id": "buscar-produto-na-saraiva",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@ProdutoSariva"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 8,
  "name": "que eu acesse o site da Submarino",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "efetue a busca por um produto no campo de pesquisa",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "selecionar o produto desejado",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "adicionar o produto no carrinho de compras",
  "keyword": "E "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 14,
  "name": "Adicionar produto no carrinho de compra",
  "description": "",
  "id": "buscar-produto-na-saraiva;adicionar-produto-no-carrinho-de-compra",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 13,
      "name": "@adicionarProduto"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "validar se o produto se encontra no carrinho de compras",
  "keyword": "Entao "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 8,
  "name": "que eu acesse o site da Submarino",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "efetue a busca por um produto no campo de pesquisa",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "selecionar o produto desejado",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "adicionar o produto no carrinho de compras",
  "keyword": "E "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 18,
  "name": "Deletar produto no carrinho de compra",
  "description": "",
  "id": "buscar-produto-na-saraiva;deletar-produto-no-carrinho-de-compra",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 17,
      "name": "@deletarProduto"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "deletar o produto adicionado no carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "o sistema deve mostrar alerta",
  "keyword": "Entao "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 8,
  "name": "que eu acesse o site da Submarino",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "efetue a busca por um produto no campo de pesquisa",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "selecionar o produto desejado",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "adicionar o produto no carrinho de compras",
  "keyword": "E "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 23,
  "name": "Adicionar mais de um item do produto no carrinho de compra",
  "description": "",
  "id": "buscar-produto-na-saraiva;adicionar-mais-de-um-item-do-produto-no-carrinho-de-compra",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 22,
      "name": "@adicionarMaisItensDoProduto"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "adicionar mais de um item",
  "keyword": "E "
});
formatter.step({
  "line": 25,
  "name": "deve conter dois itens no carrinho do mesmo produto",
  "keyword": "Entao "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});