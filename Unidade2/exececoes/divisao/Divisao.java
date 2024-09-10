package Unidade2.exececoes.divisao;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Divisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, d, res;
        boolean repete = false;

        do {
            try {
            System.out.print("Numerador: ");
            n = entrada.nextInt();
            System.out.print("Denominador: ");
            d = entrada.nextInt();

            res = divisao(n, d);

            System.out.println(n + "/" + d + " = " + res);
            repete = false;
            } catch (ArithmeticException e) {
                System.out.println("Divisao por zero");
                repete = true;
            } catch (InputMismatchException e) {
                System.out.println("Tipo da entrada incorreta, entradas devem ser inteiros");
                repete = true;
            } finally {
                entrada.nextLine();
            }
        } while (repete);

        entrada.close();
    }

    public static int divisao(int num, int den) throws ArithmeticException {
        return num/den;
    }
}
