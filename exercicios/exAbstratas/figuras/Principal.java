package exercicios.exAbstratas.figuras;

public class Principal {
    public static void main(String[] args) {
        Circulo cir = new Circulo();
        Quadrado qua = new Quadrado();
        Triangulo tri = new Triangulo();

        imprimirDescricao(cir);
        imprimirDescricao(qua);
        imprimirDescricao(tri);
    }

    public static void imprimirDescricao(FiguraGeomatrica figura){
        System.out.println("Descricao: " + figura.descricao());
    }
}
