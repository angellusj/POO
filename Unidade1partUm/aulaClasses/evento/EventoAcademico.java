package Unidade1partUm.aulaClasses.evento;

public class EventoAcademico {
    String nomeEvento, localEvento;
    int participantes;

    EventoAcademico(String nome, String local, int participantes){
        nomeEvento = nome;
        localEvento = local;
        this.participantes = participantes;
    }

    void mostraEvento(){
        System.out.println("Nome: " + nomeEvento);
        System.out.println("Local: " + localEvento);
        System.out.println("Numero de participantes: " + participantes);
    }
}
