package desafio3;

public class LivroDigital extends Livro{
    public double tamanhoArquivo;
    public String formato;  
    
    public LivroDigital(String titulo, String autor, double tamanhoArquivo, String formato){
        super(titulo, autor);
        this.tamanhoArquivo = tamanhoArquivo;
        this.formato = formato;
    }

    public void setTamanhoArquivo(double tamanhoArquivo){
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public double getTamanhoArquivo(){
        return tamanhoArquivo;
    }
    public void setFormato(String formato){
        this.formato = formato;

    }
    public String getFormato(){
        return formato;

    }
    @Override
    public void infoLivro(){
        super.infoLivro();
        System.out.println("tamanho do arquivo:"+ tamanhoArquivo+"MB");
        System.out.println("formato:"+ formato );

    }

}
