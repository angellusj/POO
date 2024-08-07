package Unidade2.arraylist.contaBancaria;

import java.util.ArrayList;

public class ExtratoBancario {
    private double saldoFinal;
    private ArrayList<Double> transcoes;

    public ExtratoBancario(){
        saldoFinal = 0.0;
        transcoes = new ArrayList<Double>();
    }

    public void transacao(double valor){
        if(saldoFinal + valor >= 0){
            saldoFinal += valor;
            transcoes.add(valor);
            System.out.println("Operacao realizada.");
        }else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void visualizar(){
        System.out.println("===================");
        //for (Double d : transcoes){
            //System.out.println(d);
        //}
        for (int i = 0; i < transcoes.size(); i++){
            System.out.println(i + " " + transcoes.get(i));
        }
        System.out.println("Saldo: " + saldoFinal);
        System.out.println("===================");
    }
}
