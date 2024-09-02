package desafio8;

public class Main {
    public static void main(String[] args) {

        FormaPagamento pagamentocartao = new CartaoCredito();
        pagamentocartao.processarPagamento(150);

        FormaPagamento pagamentoboleto = new Boleto();
        pagamentoboleto.processarPagamento(200);
        

    }
    
}
