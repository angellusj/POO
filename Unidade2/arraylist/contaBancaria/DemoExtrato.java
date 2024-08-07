package Unidade2.arraylist.contaBancaria;

import java.util.Scanner;

public class DemoExtrato {
    public static void main(String[] args) {
        int opcao;
        double valor;
        Scanner sc = new Scanner(System.in);
        ExtratoBancario extrato = new ExtratoBancario();

        do {
        System.out.println("1 - Deposito");
        System.out.println("2 - Saque");
        System.out.println("3 - Visualizar extrato");
        System.out.println("4 - Encerrar");
        System.out.print("Opcao: ");
        opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor do deposito: ");
                    valor = sc.nextDouble();
                    extrato.transacao(valor);
                    break;
                case 2:
                    System.out.print("Valor do saque: ");
                    valor = sc.nextDouble();
                    extrato.transacao(-valor);
                    break;
                case 3:
                    extrato.visualizar();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }while (opcao != 4);

        sc.close();
    }
}
