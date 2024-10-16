package SistemasdePecas;

public class Peca {
	
	// Atributos da classe aqui
    private String nome;
    private float custo;
    private float lucro;

    // Construtor da classe aqui
    public Peca(String nome, float custo, float lucro) {
        this.nome = nome;
        this.custo = (custo < 0) ? 0 : custo;   // Define o custo; se for negativo, atribui 0
        this.lucro = (lucro < 0) ? 0 : lucro;   // Define o lucro; se for negativo, atribui 0
    }

    // Método para calcular o preço final da peça
    public float calcularPreco() {
        return custo + lucro;
    }

    // Métodos getters aqui
    public String getNome() {
        return nome;
    }

    public float getCusto() {
        return custo;
    }

    public float getLucro() {
        return lucro;
    }

    // Sobrescreve o método toString para aparecer as informações bonitinhas 
    @Override
    public String toString() {
        return "Nome do Produto: " + nome +
               "\nCusto inicial: " + custo +
               "\nLucro desejado: " + lucro;
    }
}
