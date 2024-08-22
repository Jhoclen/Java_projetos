

package desafio1;



public class Produto {
    
    private String nome;
    private Double preco;

    public Produto(String nome, double preco ){
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public String getNome(){
        return nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }
    public void mostrar(){
        System.out.println("Nome:" + nome);
        System.out.println("Preco:"+ preco);
    }
}
