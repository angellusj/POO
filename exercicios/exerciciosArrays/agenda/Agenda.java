package exercicios.exerciciosArrays.agenda;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> compromissos;

    public Agenda(){
        compromissos = new ArrayList<>();
    }

    public void novoCompromisso(String horario, String assuntoAgenda, int dia, int mes, int ano){
        compromissos.add(new EntradaEmAgenda(horario, assuntoAgenda, dia, mes, ano));
    }

    public void listaDia(int dia, int mes, int ano){
        for (EntradaEmAgenda i : compromissos) {
            if (i.ehNoDia(dia, mes, ano)) System.out.println(i);
        }
    }
}
