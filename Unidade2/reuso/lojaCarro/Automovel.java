package Unidade2.reuso.lojaCarro;

public class Automovel {
    protected int ano;
    protected String cor;
    protected String modelo;

    public Automovel(int ano, String cor, String modelo){
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
    }

    public double quantoCusta(){
        return(ano<2010?20000:40000);
    }
}
