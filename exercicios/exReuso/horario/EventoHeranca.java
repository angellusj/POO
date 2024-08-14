package exercicios.exReuso.horario;

public class EventoHeranca extends DataHora{
    private String evento;

    public EventoHeranca(String data, String hora, String evento){
        super(data, hora);
        this.evento = evento;
    }

    public String getEvento(){
        return evento;
    }

    public String toString(){
        return super.toString() + "Evento: " + "\n";
    }
}
