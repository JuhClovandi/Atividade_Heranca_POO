package contabancaria; 

public class ContaPoupanca extends ContaBancaria { 
    
	// Atributo dia do rendimento aqui
    private int diaRendimento; 

    // Construtor da classe aqui, herdando os atributos da classe ContaBancaria, chamando da classe pai pelo super();
    public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo); 
        this.diaRendimento = diaRendimento; 
    }

    // Getter e setter para o dia do rendimento aqui
    public int getDiaRendimento() {
        return diaRendimento; 
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento; 
    }
    
    // Método para calcular o novo saldo baseado na taxa de rendimento aqui, fazendo a verificação do dia de rendimento 
    public void calcularNovoSaldo(double taxaRendimento) {
        if (this.diaRendimento == 5) { 
            double saldoAntigo = super.getSaldo(); 
            double novoSaldo = saldoAntigo + (taxaRendimento * saldoAntigo); 
            super.setSaldo(novoSaldo); // Atualiza o saldo na classe pai
            System.out.printf("Saldo atual após rendimento: R$ %.2f! WOW ficou mais rico(a) em!%n", novoSaldo); 
        } else {
            System.out.println("Não houve rendimento, pois não é dia de rendimento ainda! Aguarde que jajá você fica mais rico =) "); 
        }
    }
    
 // Esse daqui é um Método que fornece uma representação em string do objeto, para uma melhor visualização né?! igual na ContaBancaria
    @Override
    public String toString() {
        return super.toString() 
                + "\nDia rendimento: " + diaRendimento; 
    }
}
