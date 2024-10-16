package contabancaria;

public class ContaBancaria {
	
    // atributos da classe aqui
    private String nomeCliente;
    private String numeroConta; 
    private double saldo;
    
    // construtor dos atributos aqui, para inicializar os atributos ao criar um objeto da classe
    public ContaBancaria(String nomeCliente, String numeroConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo >= 0 ? saldo : 0; // Garantir saldo não esteja negativo ao inicializar
    }

    // métodos de depositar e sacar aqui
    public void depositar(double valor) {
        if (valor > 0) { 
            saldo += valor; 
            System.out.printf("Depósito de R$ %.2f efetivado com sucesso! Isso mesmo, vamos juntar grana em! %n", valor); 
            System.out.printf("O saldo atual agora é de: R$ %.2f%n", saldo);
        } else {
            System.out.println("Depósito inválido: o valor de depósito deve ser positivo! Tente novamente, querido(a)!"); 
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) { 
            saldo -= valor; 
            System.out.printf("Saque de R$ %.2f efetivado com sucesso! Agora pode gastaaar em, mas gaste com sabedoria! %n", valor); 
            System.out.printf("O saldo atual agora é de: R$ %.2f%n", saldo);
        } else {
            System.out.println("Saque inválido: o saldo é insuficiente ou o valor não é positivo! Tenta novamente, querido(a)!"); 
        }
    }

    // métodos getters (get para acessar os atributos privados) e setter (set para atualizar) aqui 
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    
    public double getSaldo() {
		return saldo;
	}

	
    public void setSaldo(double saldo) {
        this.saldo = saldo; // Permite que o saldo seja negativo
    }
    
 // Esse daqui é um Método que fornece uma representação em string do objeto, para uma melhor visualização né?!
    @Override
    public String toString() {
        return "\nCliente: " + nomeCliente +
               "\nNº conta: " + numeroConta +
               "\nSaldo Atual: R$ " + saldo;
    }
}
