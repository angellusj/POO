package exercicios.exReuso.emprego;

public class Assistente extends Funcionario{
    private int matricula;

    public Assistente(String nome, double salario, int matricula){
        super(nome, salario);
        this.matricula = matricula;
    }

    public int getMatricula(){
        return matricula;
    }

    public String toString(){
        return super.toString() + "Matricula: " + matricula + "\n";
    }
}
