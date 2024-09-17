package exercicios.exerciciosArrays.matriz;

import java.util.ArrayList;

public class Matriz {
    private ArrayList<ArrayList<Float>> matriz;

    public Matriz(ArrayList<ArrayList<Float>> matriz) {
        if (matrizEhValida(matriz)) {
            this.matriz = matriz;
        } else {
            System.out.println("Matriz inválida. Deve ser 2x2.");
            this.matriz = new ArrayList<>();
            ArrayList<Float> linha1 = new ArrayList<>();
            linha1.add(0.0f);
            linha1.add(0.0f);
            ArrayList<Float> linha2 = new ArrayList<>();
            linha2.add(0.0f);
            linha2.add(0.0f);
            this.matriz.add(linha1);
            this.matriz.add(linha2);
        }
    }

    private boolean matrizEhValida(ArrayList<ArrayList<Float>> matriz) {
        return matriz.size() == 2 && matriz.get(0).size() == 2 && matriz.get(1).size() == 2;
    }

    public float determinante() {
        return (matriz.get(0).get(0) * matriz.get(1).get(1)) - (matriz.get(0).get(1) * matriz.get(1).get(0));
    }

    public void imprimirMatriz() {
        for (ArrayList<Float> linha : matriz) {
            for (Float elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}  

