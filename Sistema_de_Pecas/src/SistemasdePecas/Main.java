package SistemasdePecas;

public class Main {
    public static void main(String[] args) {
        //peças nacionais
        Peca peca1 = new Peca("Resistor 10k", 0.20f, 0.10f); // R$ 0,20 de custo e R$ 0,10 de lucro
        Peca peca2 = new Peca("Capacitor 100uF", 0.50f, 0.20f); // R$ 0,50 de custo e R$ 0,20 de lucro
        
        //importadas
        PecaImportada pecaImportada1 = new PecaImportada("Microcontrolador XYZ", 30.00f, 15.00f, 10.0f, 5.00f); // R$ 30,00 de custo
        PecaImportada pecaImportada2 = new PecaImportada("Sensor de Temperatura", 25.00f, 10.00f, 15.0f, 3.00f); // R$ 25,00 de custo
        
        // Exibindo as informações das peças
        System.out.println(peca1);
        System.out.printf("Preço de venda: R$ %.2f%n", peca1.calcularPreco());
        System.out.println("////////////////////////////////////////////////\n");
        
        System.out.println(peca2);
        System.out.printf("Preço de venda: R$ %.2f%n", peca2.calcularPreco());
        System.out.println("////////////////////////////////////////////////\n");
        
        System.out.println(pecaImportada1);
        System.out.printf("Preço de venda: R$ %.2f%n", pecaImportada1.calcularPreco());
        System.out.println("////////////////////////////////////////////////\n");
        
        System.out.println(pecaImportada2);
        System.out.printf("Preço de venda: R$ %.2f%n", pecaImportada2.calcularPreco());
        System.out.println("////////////////////////////////////////////////\n");
    }
}
