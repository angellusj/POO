package Unidade2.colecoes.cores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Cores {
    public static void estaNaLista(ArrayList<String> lista, String alvo){
        if(lista.contains(alvo)){
            System.out.println("O elemento [" + alvo + "] esta na posicao " + Collections.binarySearch(lista, alvo));
        } else {
            System.out.println("O elemento [" + alvo + "] nao esta na lista");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>(Arrays.asList("Branco", "Azul", "Vermelho", "Preto", "Rosa"));
        cores.add("Laranja");
        cores.addAll(Arrays.asList("Amarelo", "Cinza"));
        System.out.println(cores);

        Collections.sort(cores);

        System.out.println(cores);

        estaNaLista(cores, "ciano");
        estaNaLista(cores, "Laranja");
        estaNaLista(cores, "Preto");
    }
}
