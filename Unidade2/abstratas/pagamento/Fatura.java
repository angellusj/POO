package Unidade2.abstratas.pagamento;

public class Fatura implements Pagavel{
    private double preco;
    private int quantidade;

    public Fatura(double preco, int quantidade) {
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorDoPagamento(){
        return quantidade * preco;
    }

}
