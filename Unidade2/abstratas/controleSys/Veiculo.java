package Unidade2.abstratas.controleSys;

public abstract class Veiculo {
    private int capacidade;

    public Veiculo(int capacidade) {
        this.capacidade = capacidade;
    }

    public abstract void moverFrente();
}
