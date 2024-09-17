package exercicios.exExcecoes.meses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Digite um numero inteiro entre 1 e 12 para obter o mes correspondente:");
            int numero = obterMesValido(entrada);
            
            if (numero >= 1 && numero <= 12) {
                System.out.println("O mes correspondente ao numero " + numero + " é: " + meses[numero - 1]);
            } else {
                System.out.println("Numero invalido! O número deve estar entre 1 e 12.");
            }
            
        } finally {
            entrada.close();
        }
    }

    public static int obterMesValido(Scanner entrada) {
        while (true) {
            try {
                return entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                entrada.next();
            }
        }
    }
}
