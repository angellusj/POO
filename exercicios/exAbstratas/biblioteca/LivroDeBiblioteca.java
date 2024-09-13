package exercicios.exAbstratas.biblioteca;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
    private boolean emprestado;
    private String bloco;
    private String numeroDePrateleira;
    private String descricao; 

    public LivroDeBiblioteca(String nome, String autor, int numPaginas, int anoEdicao, boolean emprestado, String bloco, String numeroDePrateleira, String descricao){
        super(nome, autor, numPaginas, anoEdicao);
        this.emprestado = false;
        this.bloco = bloco;
        this.numeroDePrateleira = numeroDePrateleira;
        this.descricao = descricao;
    }

    public boolean estahEmprestado(){
        return emprestado;
    }

    public void empresta(){
        this.emprestado = true;
    }

    public void devolve(){
        this.emprestado = false;
    }

    public String localizacao(){
        return "Bloco de " + bloco + ", " + "prateleira " + numeroDePrateleira + "\n";
    }

    public String descricao(){
        return descricao;
    }

    @Override
    public String toString() {
        String res = super.toString();
        res += emprestado ? "Emprestado\n" : "Na estante\n";
        res += localizacao();

        return res;
    }
}
