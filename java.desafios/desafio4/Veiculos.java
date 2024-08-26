package desafio4;

public class Veiculos {
    private String marca;
    private int ano;

    public Veiculos(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }
    public void infoBike(){
        System.out.println("Marca:"+marca);
        System.out.println("ano:"+ ano);
    }
}
