package desafio4;

public class Bicicleta extends Veiculos {
    private String tipo;

    public Bicicleta(String marca, int ano, String tipo){
        super(marca, ano);
        this.tipo = tipo;

    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }
    
    @Override
    public void infoBike(){
        super.infoBike();
        System.out.println("tipo:" + tipo);
    }
}
