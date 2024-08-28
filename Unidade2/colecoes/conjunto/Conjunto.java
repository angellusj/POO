package Unidade2.colecoes.conjunto;

import java.util.TreeSet;

public class Conjunto {
    public static void main(String[] args) {
        TreeSet<String> cores = new TreeSet<>();
        cores.add("Preto");
        System.out.println(cores);
        cores.add("Vermelho");
        System.out.println(cores);
        cores.add("Cinza");
        System.out.println(cores);
        cores.add("Amarelo");
        System.out.println(cores);
        cores.add("Azul");
        System.out.println(cores);
        cores.add("Roxo");
        System.out.println(cores);

        System.out.println("Antes da cor preto: " + cores.headSet("Preto"));
        System.out.println("A partir da cor preto: " + cores.tailSet("Preto"));
        System.out.println("1a cor: " + cores.first());
        System.out.println("Ultima cor: " + cores.last());
    }
}
