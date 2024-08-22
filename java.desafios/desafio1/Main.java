


package desafio1;

public class Main {
    public static void main(String[] args) {
        
        Produto produto = new Produto("celular", 1502.54);
        produto.setNome("batata");
        System.out.println(produto.getNome() + "\n");
        produto.mostrar();
        

        Eletronico eletronico = new Eletronico("geladeira", 5000.650, "eletrolux");
        eletronico.setPreco(35000);
        eletronico.mostrar();
    }
}
