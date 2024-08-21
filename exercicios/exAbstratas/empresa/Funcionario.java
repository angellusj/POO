package exercicios.exAbstratas.empresa;

public class Funcionario {
    private String nome;
    private int id;
    private double salarioPorHora;

    public Funcionario(String nome) {
        this.nome = nome;
        id = 10;
        salarioPorHora = 2.0;
    }

    public Funcionario(String nome, double salarioPorHora) {
        this.nome = nome;
        id = 21;
        this.salarioPorHora = salarioPorHora;
    }

    public String getNome(){
        return nome;
    }

    public int getId(){
        return id;
    }

    public double getDouble(){
        return salarioPorHora;
    }

    public String toString(){
        return "Nome: " + nome + "\n" + "ID: " + id + "\n" + "Salario por hora: " + salarioPorHora;
    }

}
