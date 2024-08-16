package exercicios.exReuso.politica;

public class Prefeito extends Politico{
    private String cidade;

    public Prefeito(String nome, int idade, String partido, String cidade){
        super(nome, idade, partido);
        this.cidade = cidade;
    }

    public String getCidade(){
        return cidade;
    }

    public String toString(){
        return super.toString() + "Candidato para prefeito da cidade " + cidade + "\n";
    }
}
