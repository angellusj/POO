package exercicios.exerciciosClasses.contador;

public class TesteContagem {
    public static void main(String[] args) {
        Contador cont = new Contador(1);

        cont.adicionar();
        cont.adicionar();
        cont.zerar();
        cont.adicionar();
        cont.adicionar();
        
        cont.imprimirContador();
    }
}
