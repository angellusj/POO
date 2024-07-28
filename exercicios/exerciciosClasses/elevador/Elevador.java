package exercicios.exerciciosClasses.elevador;

public class Elevador {
    private int andarAtual, totalAndares, capacidade, quantidadePessoas;

    public Elevador(int totalAndares, int capacidade){
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.andarAtual = 0;
        this.quantidadePessoas = 0;
    }

    public void entra(){
        if(quantidadePessoas < capacidade){
            quantidadePessoas++;
            System.out.println("Uma pessoa entrou no elevador.");
        } else {
            System.out.println("Elevador com capacidade máxima!");
        }
    }

    public void sai(){
        if(quantidadePessoas >= 1){
            quantidadePessoas--;
            System.out.println("Uma pessoa saiu do elevador.");
        } else {
            System.out.println("Não há mais pessoas no elevador.");
        }
    }

    public void sobe(){
        if(andarAtual < totalAndares && andarAtual >= 0){
            andarAtual++;
            System.out.println("O elevador subiu um andar");
        } else {
            System.out.println("O elevador se encontra no último andar!");
        }
    }

    public void desce(){
        if(andarAtual > 0 && andarAtual <= totalAndares){
            andarAtual--;
            System.out.println("O elevador desceu um andar");
        } else {
            System.out.println("O elevador se encontra no térreo");
        }
    }

}
