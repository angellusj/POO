package exercicios.exReuso.emprego;

public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double aumentarSalario(double aumento){
        this.salario += aumento;
        return aumento;
    }

    public double ganhoAnual(){
        double salarioAnual = salario*12;
        double decimoTerceiro = salario;
        return salario + decimoTerceiro;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public String toString(){
        return "Nome: " + nome + "\n" + "Salario mensal: " + salario + "\n\n";
    }
}
