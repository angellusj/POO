package Unidade2.abstratas.controleSys;

public abstract class Aquatico extends Veiculo {
    private double profundidade;

    public Aquatico(int capacidade, double profundidade) {
        super(capacidade);
        this.profundidade = profundidade;
    }   
}
