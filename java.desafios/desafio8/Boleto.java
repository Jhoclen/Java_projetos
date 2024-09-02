package desafio8;

public class Boleto extends FormaPagamento {
    
    @Override
    public void processarPagamento(double valor){
     
        System.out.println("o valor pago R$:"+ valor +" metodo de pagamento Boleto");
    }
}
