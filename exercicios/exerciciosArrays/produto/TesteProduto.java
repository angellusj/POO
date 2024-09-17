package exercicios.exerciciosArrays.produto;

import java.util.ArrayList;

public class TesteProduto {
    public static void main(String[] args) {
        ArrayList<Integer> calculo3 = new ArrayList<>();
        calculo3.add(2);
        calculo3.add(3);
        calculo3.add(4);
        System.out.println("Produto de [2, 3, 4]: " + Produto.produto(calculo3));

        ArrayList<Integer> calculo2 = new ArrayList<>();
        calculo2.add(5);
        calculo2.add(6);
        System.out.println("Produto de [5, 6]: " + Produto.produto(calculo2));

        ArrayList<Integer> calculo1 = new ArrayList<>();
        calculo1.add(7);
        System.out.println("Produto de [7]: " + Produto.produto(calculo1));

        ArrayList<Integer> calculo0 = new ArrayList<>();
        System.out.println("Produto de []: " + Produto.produto(calculo0));
    }
}
