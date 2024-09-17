package exercicios.exerciciosArrays.produto;

import java.util.ArrayList;

public class Produto {
    public static int produto(ArrayList<Integer> numeros) {
        int produto = 1;
        for (int numero : numeros) {
            produto *= numero;
        }
        return produto;
    }
}
