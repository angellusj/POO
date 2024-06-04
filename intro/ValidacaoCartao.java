package intro;

import java.util.Calendar;
import java.util.Scanner;

public class ValidacaoCartao {
    public static void main(String[] args){
        String nome, numero, cod;
        int mes, ano, mesAtual, anoAtual;
        Scanner input = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        System.out.print("Nome: ");
        nome = input.nextLine();
        System.out.print("Número: ");
        numero = input.nextLine();
        System.out.print("Código: ");
        cod = input.nextLine();
        System.out.print("Mes da validade: ");
        mes = input.nextInt();
        System.out.print("Ano da validade: ");
        ano = input.nextInt();

        anoAtual = calendar.get(Calendar.YEAR);
        mesAtual = calendar.get(Calendar.MONTH);

        input.close();
    }
}
