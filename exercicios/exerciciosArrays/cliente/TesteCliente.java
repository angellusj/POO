package exercicios.exerciciosArrays.cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList<>();

        while(true){
            System.out.println("Informe o ID do cliente: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            if(id < 0){
                break;
            }

            System.out.println("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade do cliente: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite o telefone do cliente: ");
            String telefone = scanner.nextLine();

            Cliente cliente = new Cliente(id, idade, nome, telefone);
            clientes.add(cliente);
        }

        System.out.println("\nClientes cadastrados:");
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente foi cadastrado.");
        } else {
            for (Cliente cliente : clientes) {
                cliente.informacoesDoCliente(); 
            }
        }

        scanner.close();
    }
}
