package exercicios.exReuso.emprego;

public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(){
        double aumento;
        
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public String toString(){
        return "Nome: " + nome + "\n" + "Salario: " + salario + "\n\n";
    }
}
