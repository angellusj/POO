package exercicios.exReuso.horario;

public class EventoHeranca extends DataHora{
    private String evento;

    public EventoHeranca(int dia, int mes, int ano, int hora, int minuto, String evento){
        super(dia, mes, ano, hora, minuto);
        this.evento = evento;
    }

    public String getEvento(){
        return evento;
    }

    public String toString(){
        return super.toString() + "Evento: " + evento + "\n";
    }
}
