package TiposdeProdutos;

public class Main {
	
	public static void main(String[] args) {
        // um produto de cada tipo
        Produto produtoEstadual = new ProdutoEstadual("Produto Estadual", 100.00f);
        Produto produtoNacional = new ProdutoNacional("Produto Nacional", 100.00f);
        Produto produtoImportado = new ProdutoImportado("Produto Importado", 100.00f);

        // Exibindo informações dos produtos
        System.out.println(produtoEstadual);
        System.out.printf("Preço final: R$ %.2f%n", produtoEstadual.calcularPrecoFinal());
        System.out.println("////////////////////////////////////////////////\n");

        System.out.println(produtoNacional);
        System.out.printf("Preço final: R$ %.2f%n", produtoNacional.calcularPrecoFinal());
        System.out.println("////////////////////////////////////////////////\n");

        System.out.println(produtoImportado);
        System.out.printf("Preço final: R$ %.2f%n", produtoImportado.calcularPrecoFinal());
        System.out.println("////////////////////////////////////////////////\n");
    }

}
