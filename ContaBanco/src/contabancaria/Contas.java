package contabancaria;

public class Contas {

    public static void main(String[] args) {
        
        System.out.println("Bem-vindo ao Banco UCB!");
        System.out.println("-----------------------");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////");
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////
        // Conta Bancária Simples
        System.out.println("\n##### Conta Bancária Simples #####");
        ContaBancaria c1 = new ContaBancaria("Fulano", "111-X", 0);
        
        c1.setNomeCliente("Fulano Silva");
        System.out.println(c1);
        
        // Depositar
        double deposito = 10;
        c1.depositar(deposito);
        System.out.println("----- Conta Atualizada -----");
        System.out.println(c1);
        
        // Sacar
        double saque = 50;
        c1.sacar(saque);
        System.out.println("----- Conta Atualizada -----");
        System.out.println(c1);
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////");
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n##### Conta Poupança #####");
        ContaPoupanca cp = new ContaPoupanca("Ciclano Carvalho", "222-X", 0, 5);
        System.out.println(cp);

        // Depositar na conta poupança
        double deposito2 = 20;
        cp.depositar(deposito2);
        System.out.println("----- Conta Atualizada -----");
        System.out.println(cp);

        // Rendimento da conta poupança
        double taxaRendimento = 0.05; // 5%
        cp.calcularNovoSaldo(taxaRendimento);
        System.out.println("----- Conta Atualizada Após Rendimento -----");
        System.out.println(cp);

        // Sacar da conta poupança
        double saque5 = 10; // Tente sacar um valor
        cp.sacar(saque5);
        System.out.println("----- Conta Atualizada Após Saque -----");
        System.out.println(cp);
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////");
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////
        // Conta Especial
        System.out.println("\n###### Conta Especial #####");
        ContaEspecial ce = new ContaEspecial("Beltrano", "333-X", 100, 50);
        System.out.println(ce);
        
        // Depositar na conta especial
        double deposito3 = 30;
        ce.depositar(deposito3);
        System.out.println("----- Conta Atualizada -----");
        System.out.println(ce);
        
        // Sacar da conta especial
        double saque2 = 120; // Tentativa de sacar mais que o saldo + limite
        ce.sacar(saque2);
        System.out.println("----- Conta Atualizada -----");
        System.out.println(ce);
        
        // Sacar dentro do limite
        double saque3 = 60;
        ce.sacar(saque3);
        System.out.println("----- Conta Atualizada -----");
        System.out.println(ce);
        
        // Sacar fora do limite
        double saque4 = 70;
        ce.sacar(saque4);
        System.out.println("----- Conta Atualizada -----");
        System.out.println(ce);
        
        // Mostrar saldo disponível
        System.out.printf("Saldo disponível (incluindo limite): R$ %.2f%n", ce.getSaldoDisponivel());
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////");
    }
}
