package exercicios.exerciciosClasses.lampada;

public class Lampada {
    int estadoDaLampada, ligado = 0, desligado = 1, quantidade;
    boolean estaLig;

    public Lampada(int estado, boolean estaLig){
        this.estadoDaLampada = estado;
        this.estaLig = estaLig;
    }

    public void acende(){
        if(estadoDaLampada != ligado){
            estadoDaLampada = ligado;
        }
    }

    public void apaga(){
        if(estadoDaLampada != desligado){
            estadoDaLampada = desligado;
        }
    }

    public void mostraEstado(){
        if(estadoDaLampada == 0){
            System.out.println("A lampada está ligada");
        } if(estadoDaLampada == 1){
            System.out.println("A lampada está desligada");
        } else {
            System.out.println("A lampada queimou");
        }
    }

    public boolean estaLigada(boolean estaLig){
        if(estadoDaLampada == 0){
            return estaLig = true; 
        } else {
            return estaLig = false;
        }
    }

}
