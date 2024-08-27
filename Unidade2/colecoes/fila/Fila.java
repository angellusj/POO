package Unidade2.colecoes.fila;

import java.util.PriorityQueue;

public class Fila {
    public static void main(String[] args) {
        PriorityQueue<Double> fila = new PriorityQueue<>();
        System.out.println(fila);
        fila.offer(6.5);
        fila.offer(4.4);
        fila.offer(3.1);
        fila.offer(8.2);
        System.out.println(fila);

        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }
    }
}
