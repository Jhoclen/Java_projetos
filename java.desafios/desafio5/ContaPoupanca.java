package desafio5;

public class ContaPoupanca extends ContaBancaria {

    private int taxaRend;
    public float rend;

    public ContaPoupanca(int numeroConta, float saldo, int taxaRend ){
        super(numeroConta, saldo);
        this.taxaRend = taxaRend;
    }
    public void setTaxaRend(int taxaRend){
        this.taxaRend = taxaRend;
    }
    public int getTaxaRend(){
        return taxaRend;
    }
    @Override
    public void rendInfo(){
        super.rendInfo();
        rend = getSaldo() + (getSaldo() * taxaRend/100);
        System.out.println("Saldo depois do rendimento: "+ rend);
        
    }
    
}
