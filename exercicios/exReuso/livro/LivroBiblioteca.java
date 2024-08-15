package exercicios.exReuso.livro;

public class LivroBiblioteca extends Livro{
    private String nome;
    private boolean emprestimo;
    private int qtdDiaEmprestimo;

    public LivroBiblioteca(String titulo, String autor, int codigo, String editora, String nome, boolean emprestimo, int quantidade){
        super(titulo, autor, codigo, editora);
        this.nome = nome;
        this.emprestimo = emprestimo;
        qtdDiaEmprestimo = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public boolean getEmprestimo(){
        return emprestimo;
    }

    public int getQuantidade(){
        return qtdDiaEmprestimo;
    }

    public String toString(){
        return super.toString() + "Biblioteca: " + nome + "\t" + "Disponivel para emprestimo: " + emprestimo + "\t" + "Quantidade maxima de dias permitido ficar emprestado: " + qtdDiaEmprestimo + "\n";
    }
}
