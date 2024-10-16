package TiposdeProdutos;

	public class ProdutoEstadual extends Produto {
	    // atributos iguais da classe pai 
		// Construtor
	    public ProdutoEstadual(String descricao, float valor) {
	        super(descricao, valor);
	    }
        // Metodo de calcular o valor estadual
	    @Override
	    public float calcularPrecoFinal() {
	        return valor + (valor * imposto); // Valor + imposto
	    }
	}


