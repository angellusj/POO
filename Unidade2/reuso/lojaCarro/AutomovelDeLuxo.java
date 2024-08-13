package Unidade2.reuso.lojaCarro;

public class AutomovelDeLuxo extends AutomovelBasico{
    private boolean arCondicionado;
    private boolean direcaoHidraulica;

    public AutomovelDeLuxo(int ano, String modelo, String cor, boolean airbag, boolean radio, boolean arCondicionado, boolean direcaoHidraulica){
        super(ano, modelo, cor, airbag, radio);
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public double quantoCusta(){
        double custo = super.quantoCusta();
        if(arCondicionado) custo += 5000;
        if(direcaoHidraulica) custo += 3125;
        return custo;
    }

    public String toString(){
        String res = "";
        res += "Ano: " + ano + "\n";
        res += "modelo: " + modelo + "\n";
        res += "cor: " + cor + "\n";
        res += "airbag: " + airbag + "\n";
        res += "radio: " + radio + "\n";
        res += "Ar condicionado: " + arCondicionado + "\n";
        res += "Direcao Hidraulica: " + direcaoHidraulica + "\n";
        return res;
    }
}
