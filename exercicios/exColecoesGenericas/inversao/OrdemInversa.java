package exercicios.exColecoesGenericas.inversao;

import java.util.LinkedList;

public class OrdemInversa {
    public static void main(String[] args) {
        LinkedList<Character> listaOriginal = new LinkedList<>();
        for(char c = 'A'; c <= 'J'; c++){
            listaOriginal.add(c);
        }

        System.out.println("Lista original: " + listaOriginal);

        LinkedList<Character> listaInversa = new LinkedList<>();
        for( int i = listaOriginal.size() - 1; i >= 0; i--){
            listaInversa.add(listaOriginal.get(i));
        }

        System.out.println("Lista inversa: " + listaInversa);

    }
}