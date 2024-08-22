package desafio2;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    public void getMatricula(int matricula){
        this.matricula = matricula;
    }

    public int getMatricula(){
        return matricula;
    }
    @Override
    public void  infoAluno(){
        super.infoAluno();
        System.out.println("Matricula:" + matricula);

    }
}
