package Unidade2.colecoes.remocao;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class RemoveDaLista {
    public static void remove(LinkedList<String> original, LinkedList<String> remover){
        ListIterator<String> iterator = original.listIterator();
        while (iterator.hasNext()){
            String aux = iterator.next();
            if (remover.contains(aux)) iterator.remove();
        }
    }
    public static void main(String[] args) {
        LinkedList<String> listaOriginal = new LinkedList<>(Arrays.asList("Branco", "Preto", "Vermelho", "Laranja", "Azul", "Amarelo", "Cinza"));
        LinkedList<String> listaRemover = new LinkedList<>(Arrays.asList("Laranja", "Cinza"));

        System.out.println(listaOriginal);
        remove(listaOriginal, listaRemover);
        System.out.println(listaOriginal);
    }
}
