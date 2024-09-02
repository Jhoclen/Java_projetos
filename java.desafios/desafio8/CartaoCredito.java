package desafio8;

public class CartaoCredito extends FormaPagamento {

    @Override
    public void processarPagamento(double valor){
     
        System.out.println("o valor pago R$:"+ valor +" metodo de pagamento cartao de credito");
    }
}

    

