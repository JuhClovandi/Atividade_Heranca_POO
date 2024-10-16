package TiposdeProdutos;

public class ProdutoImportado extends Produto {
	// atributo além dos da classe pai
	private float taxa;
    private float taxaImportacao;

    // Construtor
    public ProdutoImportado(String descricao, float valor) {
        super(descricao, valor);
        this.taxa = 0.05f; // 5% de taxa
        this.taxaImportacao = 0.05f; // 5% de taxa de importação
    }

    // Metodo de calcular o valor importado
    @Override
    public float calcularPrecoFinal() {
        return valor + (valor * imposto) + (valor * taxa) + (valor * taxaImportacao); // Valor + imposto + taxa + taxa de importação
    }

}
