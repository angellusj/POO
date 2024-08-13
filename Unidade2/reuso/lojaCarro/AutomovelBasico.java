package Unidade2.reuso.lojaCarro;

public class AutomovelBasico extends Automovel{
    protected boolean airbag;
    protected boolean radio;

    public AutomovelBasico(int ano, String modelo, String cor, boolean airbag, boolean radio){
        super(ano, modelo, cor);
        this.airbag = airbag;
        this.radio = radio;
    }

    public double quantoCusta(){
        double custo = super.quantoCusta();
        if(airbag) custo += 1000;
        if(radio) custo += 2000;
        return custo;
    }
}
