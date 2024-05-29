package intro;

import java.util.Scanner;

public class BoasVindas {
    
    public static void main(String[] args) {
        String nome;
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        nome = leitor.nextLine(); //pega todo o nome
        //nome = leitor.next(); pega apenas o primeiro nome

        System.out.println("Boas Vindas " + nome);
        
        leitor.close();
    }
}
