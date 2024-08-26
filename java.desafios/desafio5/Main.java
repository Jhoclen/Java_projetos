package desafio5;

public class Main {
    
    public static void main(String[] args) {
        
        ContaPoupanca conta = new ContaPoupanca(
            254861,
            100,
            10);
        conta.setTaxaRend(35);
        conta.rendInfo();
    }
}
