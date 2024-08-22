

package desafio1;

public class Eletronico extends Produto {

    private String marca;

    public Eletronico (String nome, double preco, String marca) {

        super(nome, preco);
        this.marca = marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Marca:" + marca);
    }
}
