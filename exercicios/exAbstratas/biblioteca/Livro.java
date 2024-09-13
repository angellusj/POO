package exercicios.exAbstratas.biblioteca;

public class Livro {
    private String nome;
    private String autor;
    private int numeroDePaginas;
    private int anoDeEdicao;

    public Livro(String nome, String autor, int numPaginas, int anoEdicao){
        this.nome = nome;
        this.autor = autor;
        numeroDePaginas = numPaginas;
        anoDeEdicao = anoEdicao;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public int getAnoDeEdicao() {
        return anoDeEdicao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public void setAnoDeEdicao(int anoDeEdicao) {
        this.anoDeEdicao = anoDeEdicao;
    }

    public String qualTitulo(){
        return nome;
    }

    public String qualAutor(){
        return autor;
    }

    public String toString(){
        return "Titulo: " + qualTitulo() + "\n" + "Autor: " + qualAutor() + "\n" + "Numero de paginas: " + numeroDePaginas + "\n" + "Ano da edicao: " + anoDeEdicao + "\n";
    }
}
