package exercicios.exerciciosArrays.dados;

import java.util.ArrayList;
import java.util.Random;

public class LancamentoDeDados {
    public static void main(String[] args) {
        final int NUM_LANCAMENTOS = 36_000_000;

        ArrayList<Integer> frequencias = new ArrayList<>(13);
        for (int i = 0; i < 13; i++) {
            frequencias.add(0);
        }

        Random random = new Random();

        for (int i = 0; i < NUM_LANCAMENTOS; i++) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int soma = dado1 + dado2;

            frequencias.set(soma, frequencias.get(soma) + 1);
        }

        System.out.println("Soma | Frequência");
        System.out.println("-----------------");
        for (int soma = 2; soma <= 12; soma++) {
            System.out.printf("%4d | %10d\n", soma, frequencias.get(soma));
        }
    }
}
