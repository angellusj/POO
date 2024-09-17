package exercicios.exerciciosArrays.matriz;

import java.util.ArrayList;

public class TesteMatriz {
    public static void main(String[] args) {
        ArrayList<Float> linha1 = new ArrayList<>();
        linha1.add(1.5f);
        linha1.add(2.0f);

        ArrayList<Float> linha2 = new ArrayList<>();
        linha2.add(3.0f);
        linha2.add(4.5f);

        ArrayList<ArrayList<Float>> matriz2x2 = new ArrayList<>();
        matriz2x2.add(linha1);
        matriz2x2.add(linha2);

        Matriz matriz = new Matriz(matriz2x2);

        System.out.println("Matriz:");
        matriz.imprimirMatriz();

        float determinante = matriz.determinante();
        System.out.println("Determinante: " + determinante);

        ArrayList<ArrayList<Float>> matrizInvalida = new ArrayList<>();
        matrizInvalida.add(new ArrayList<>());

        Matriz matrizErro = new Matriz(matrizInvalida);
        matrizErro.imprimirMatriz();
        System.out.println("Determinante: " + matrizErro.determinante());
    }
}
