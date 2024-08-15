package exercicios.exReuso.livro;

public class LivroLivraria extends Livro{
    private String nome;
    private double preco;
    private int estoque;
    
    public LivroLivraria(String titulo, String autor, int codigo, String editora, String nome, double preco, int estoque){
        super(titulo, autor, codigo, editora);
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int estoque(){
        return estoque;
    }

    public String toString(){
        return super.toString() + "Livraria: " + nome + "\t" + "Preco: " + preco + "\t" + "Quantidade em estoque: " + estoque + "\n";
    }
}
