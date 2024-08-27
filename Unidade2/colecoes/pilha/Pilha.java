package Unidade2.colecoes.pilha;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<Number> pilha = new Stack<>();
        pilha.push(3.5);
        System.out.println(pilha);
        pilha.push(2);
        System.out.println(pilha);
        pilha.push(4.67F);
        System.out.println(pilha);

        while (!pilha.isEmpty()){
            System.out.println("Elemento removido: " + pilha.pop());
            System.out.println(pilha);
        }
    }
}
