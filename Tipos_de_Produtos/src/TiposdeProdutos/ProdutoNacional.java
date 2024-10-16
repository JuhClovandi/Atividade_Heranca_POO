package TiposdeProdutos;

public class ProdutoNacional extends Produto {
	// atributo além dos da classe pai
	private float taxa;

	// Construtor
    public ProdutoNacional(String descricao, float valor) {
        super(descricao, valor);
        this.taxa = 0.05f; // 5% de taxa
    }
    
    // Metodo de calcular o valor nacional
    @Override
    public float calcularPrecoFinal() {
        return valor + (valor * imposto) + (valor * taxa); // Valor + imposto + taxa
    }

}
