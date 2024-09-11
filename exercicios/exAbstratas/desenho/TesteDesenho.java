package exercicios.exAbstratas.desenho;

import exercicios.exAbstratas.figuras.Circulo;
import exercicios.exAbstratas.figuras.Triangulo;

public class TesteDesenho {
    public static void main(String[] args) {
        Desenho desenho = new Desenho(new Triangulo(), new Circulo(), 2, 4, 6, 8);

        desenho.apresenta();
    }
}
