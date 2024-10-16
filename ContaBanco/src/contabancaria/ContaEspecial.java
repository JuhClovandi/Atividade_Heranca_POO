package contabancaria;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    // Construtor
    public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        setLimite(limite); 

        // Validação do saldo inicial considerando o limite
        if (saldo < 0 && Math.abs(saldo) > limite) {
            throw new IllegalArgumentException("Saldo inicial não pode ser menor que o limite negativo.");
        }
    }

    // Getter do limite
    public double getLimite() {
        return limite;
    }

    // Setter do limite com validação
    public void setLimite(double limite) {
        if (limite >= 0) {
            this.limite = limite;
        } else {
            System.out.println("O limite não pode ser negativo! Limite não pôde ser alterado, querido(a).");
        }
    }

    // Método que retorna o saldo disponível, considerando o limite
    public double getSaldoDisponivel() {
        return super.getSaldo() + limite; 
    }

    // Método para sacar com lógica de limite
    @Override
    public void sacar(double valor) {
        double saldoAtual = super.getSaldo(); 
        if (valor > 0 && (saldoAtual - valor) >= -limite) {
            super.setSaldo(saldoAtual - valor);
            System.out.printf("Saque de R$ %.2f realizado com sucesso! Gaste com sabedoria esse dinheirinho aí em! Agora seu Novo Saldo é de: R$ %.2f%n", valor, super.getSaldo());
        } else {
            System.out.printf("Saque não permitido! Saldo insuficiente, quer gastar mais do que tem... vê se pode! O seu Saldo atual é de: R$ %.2f%n", saldoAtual);
        }
    }

    // Representação da conta em string, igual a da contaBancária tbm... só vai acrescentando
    @Override
    public String toString() {
        return super.toString() + String.format("%nLimite: R$ %.2f", limite);
    }
}
