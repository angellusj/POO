package Unidade1Part2.pessoa;

public class Pessoa {
    private String nome;
    private double altura;

    Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome() {
        return "Nome:" + nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura>0) this.altura = altura;
    }

    public String toString() {
        return "Nome = " + nome + "; Altura = " + altura;
    }
}
