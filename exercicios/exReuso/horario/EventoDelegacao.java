package exercicios.exReuso.horario;

public class EventoDelegacao {
    DataHora data;
    private String evento;

    public EventoDelegacao(DataHora data, String evento){
        this.data = data;
        this.evento = evento;
    }

    public String getEvento(){
        return evento;
    }

    public String toString(){
        return data.toString() + "Evento: " + "\n";
    }
}
