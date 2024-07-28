package exercicios.exerciciosClasses.elevador;

public class TesteElevador {
    public static void main(String[] args) {
        Elevador elvd = new Elevador(12, 7);
        
        elvd.entra();
        elvd.entra();
        elvd.entra();
        elvd.entra();

        elvd.sobe();
        elvd.sobe();
        elvd.sobe();
        
        elvd.sai();
        elvd.sai();
        elvd.sai();

        elvd.entra();
        elvd.entra();
        elvd.entra();
        elvd.entra();
        elvd.entra();
        elvd.entra();
        elvd.entra();

        elvd.desce();
        elvd.desce();
        elvd.desce();
        elvd.desce();
        elvd.desce();


    }
}
