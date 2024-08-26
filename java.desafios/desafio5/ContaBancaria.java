package desafio5;

public class ContaBancaria {
    private int numeroConta;
    protected float saldo;

    public ContaBancaria(int numeroConta, float saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;

    }
    public int getNumeroConta(){
        return numeroConta;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public float getSaldo(){
        return saldo;
    }

    public void rendInfo(){
        System.out.println("numero da conta: "+ numeroConta);
        System.out.println("saldo: "+ saldo);
        
    }
}
