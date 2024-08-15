package exercicios.exReuso.livro;

public class Livro {
    private String titulo;
    private String autor;
    private int codigo;
    private String editora;

    public Livro(String titulo, String autor, int codigo, String editora){
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.editora = editora;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getEditora(){
        return editora;
    }

    public String toString(){
        return "Titulo: " + titulo + "\t" + "Autor(a): " + autor + "\t" + "Codigo: " + codigo + "\t" + "Editora: " + editora + "\n";
    }
}
