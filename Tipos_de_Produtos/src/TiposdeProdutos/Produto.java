package TiposdeProdutos;

public abstract class Produto {
		//atributos aqui, protected para serem acessados por Classes do mesmo pacote e por subclasses tbm
	    protected String descricao;
	    protected float valor;
	    protected float imposto;

	    // Construtor da classe aqui
	    public Produto(String descricao, float valor) {
	        this.descricao = descricao;
	        this.valor = valor;
	        this.imposto = 0.10f; // 10% de imposto né
	    }

	    //Método que vai ter em cada classe diferente
	    public abstract float calcularPrecoFinal();
	    
	    // pra aparecer as informações bonitinhas
	    @Override
	    public String toString() {
	        return "Descrição: " + descricao +
	               "\nValor: R$ " + valor +
	               "\nImposto: R$ " + (valor * imposto);
	    }
	}

