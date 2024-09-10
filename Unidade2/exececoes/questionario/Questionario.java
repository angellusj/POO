package Unidade2.exececoes.questionario;

public class Questionario {
    public static void main(String[] args) {
        int respostas[] = {1, 3, 4, 2, 5, 0, 5, 3, 5, 1};
        int contadores[] = new int[6];

        for (int i = 0; i <contadores.length; i++) {
            contadores[i] = 0;
        }

        for (int resp : respostas) {
            contadores[resp]++;
        }

        for (int i : contadores) {
            System.out.println(i + " ");
        }

        System.out.println();
    }
}
