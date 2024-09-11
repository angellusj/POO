package exercicios.exerciciosArrays.agenda;

public class TesteAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.novoCompromisso("20:57", "Compras", 11, 9, 2025);
        agenda.novoCompromisso("14:44", "Prova POO", 17, 9, 2024);
        agenda.listaDia(11, 9, 2025);
        agenda.listaDia(17, 9, 2024);
        
    }
}
