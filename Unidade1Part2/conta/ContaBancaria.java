package Unidade1Part2.conta;

public class ContaBancaria {
    private String nome;
    private double saldo;
    private boolean especial;

    ContaBancaria(String nome, double saldo, boolean especial){
        this.nome = nome;
        this.saldo = saldo;
        this.especial = especial;
    }

    ContaBancaria(String nome) {
        this.nome = nome;
        this.saldo = 0.0;
        this.especial = false;
    }

    public String toString() {
        String saida = "";
        saida += "Nome: " + nome;
        saida += " Saldo: " + saldo;
        saida += " Status: " + (especial? "Sim" : "Não");
        return saida;
    }
}
