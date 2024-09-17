package exercicios.exExcecoes.soma;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro número inteiro:");
            int numero1 = obterIntValido(entrada);
            
            System.out.println("Digite o segundo número inteiro:");
            int numero2 = obterIntValido(entrada);
            
            int soma = numero1 + numero2;
            System.out.println("A soma dos números é: " + soma);
            
        } finally {
            entrada.close();
        }
    }

    public static int obterIntValido(Scanner entrada) {
        while (true) {
            try {
                return entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Informe um número inteiro.");
                entrada.next();
            }
        }
    }
}
