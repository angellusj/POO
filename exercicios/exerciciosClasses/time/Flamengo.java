package exercicios.exerciciosClasses.time;

public class Flamengo {
    int pontos, gols, saldoGols, golsTomados, vitorias, empates, derrotas;

   Flamengo(int gols, int golsTomados, int vitorias, int derrotas, int empates){
        this.gols = gols;
        this.golsTomados = golsTomados;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }

    public void registraGols(int gols){
        this.gols =+ gols;
    }

    public void registraGolsTomados(int gols){
        this.golsTomados =+ gols;
    }

    public int calculaSaldo(int gols, int golsTomados){
        return this.gols-this.golsTomados;
    }

    public void registraVitoria(){
        this.vitorias++;
    }

    public void registraEmpate(){
        this.empates++;
    }

    public void registraDerrota(){
        this.derrotas++;
    }

    public int calculaPontos(){
        return (this.vitorias*3) + this.empates;
    }

    public void dadosTime(){
        int pts = calculaPontos();
        int saldo = calculaSaldo(gols, golsTomados);
        System.out.println("Clube      V     E    D   GM   GS   DG   Pts");
        System.out.println("Flamengo" +"   " + this.vitorias + "    " + this.empates + "    " + this.derrotas + "   " + this.gols + "    " + saldo + "  " + this.golsTomados + "    " + pts);
    }

}
