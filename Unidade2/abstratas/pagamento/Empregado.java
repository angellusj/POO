package Unidade2.abstratas.pagamento;

public abstract class Empregado implements Pagavel{
    private String nome;
    private String ctps;

    public Empregado(String nome, String ctps) {
        this.nome = nome;
        this.ctps = ctps;
    }

}
