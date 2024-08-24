package desafio3;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;

    }
    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

    public void infoLivro(){
        System.out.println("Titulo:"+ titulo);
        System.out.println("Autor:"+ autor);
    }
}
