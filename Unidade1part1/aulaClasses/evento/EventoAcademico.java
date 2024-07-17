package Unidade1part1.aulaClasses.evento;

public class EventoAcademico {
    private String nomeEvento, localEvento;
    private int participantes;

    EventoAcademico(String nome, String local, int participantes){
        nomeEvento = nome;
        localEvento = local;
        this.participantes = participantes;
    }

    public void mostraEvento(){
        System.out.println("Nome: " + nomeEvento);
        System.out.println("Local: " + localEvento);
        System.out.println("Numero de participantes: " + participantes);
    }
}
