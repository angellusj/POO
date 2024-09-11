package exercicios.exAbstratas.figuras;

public class Principal {
    public static void main(String[] args) {
        Circulo cir = new Circulo();
        Quadrado qua = new Quadrado();
        Triangulo tri = new Triangulo();

        cir.descricao();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        qua.descricao();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        tri.descricao();
    }
}
