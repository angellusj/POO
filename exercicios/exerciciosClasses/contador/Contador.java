package exercicios.exerciciosClasses.contador;

public class Contador {
    private int contagemEventos;

    public Contador(int contagem){
        this.contagemEventos = contagem;
    }

    public void zerar(){
       contagemEventos = 0;
    }

    public void adicionar(){
       contagemEventos++;
    }

    public void imprimirContador(){
        System.out.println("Eventos armazenados: " + contagemEventos);
    }
}
