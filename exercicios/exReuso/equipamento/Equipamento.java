package exercicios.exReuso.equipamento;

public class Equipamento {
    private String nome;
    private String marca;

    public Equipamento(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String toString(){
        return "Nome: " + nome + "\n" + "Marca: "  + marca + "\n";
    }
}
