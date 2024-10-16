package SistemasdePecas;

public class PecaImportada extends Peca {
    
	// Atributos específicos da classe filha aqui
    private float taxaImportacao;
    private float frete;

    // Construtor da classe aqui
    public PecaImportada(String nome, float custo, float lucro, float taxaImportacao, float frete) {
        super(nome, custo, lucro);
        this.taxaImportacao = (taxaImportacao < 0) ? 0 : taxaImportacao; // Define a taxa de importação; se for negativa, vira 0
        this.frete = (frete < 0) ? 0 : frete; // Define o frete; se for negativo, fica 0
    }

    // Métodos getters aqui
    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(float taxaImportacao) {
        this.taxaImportacao = (taxaImportacao < 0) ? 0 : taxaImportacao;
    }    

    public float getFrete() {
        return frete;
    }

    public void setFrete(float frete) {
        this.frete = (frete < 0) ? 0 : frete;
    }
    
    // Sobrescreve o método calcularPreco da classe paizão para incluir a taxa de importação e o frete
    @Override
    public float calcularPreco() {
        float taxa = (taxaImportacao / 100 * getCusto()) + frete; // Calcula a taxa com base no custo
        return super.calcularPreco() + taxa; 
    }
    
    // Sobrescreve o método toString para aparecer as informações bonitinhas
    @Override
    public String toString() {
        return super.toString() + "\nTaxa de importação: " + taxaImportacao +
               "\nFrete: " + frete +
               "\nValor final: " + calcularPreco();
    }
}
