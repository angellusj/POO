package exercicios.exReuso.horario;

public class DataHora {
    private String data;
    private String hora;

    public DataHora(String data, String hora){
        this.data = data;
        this.hora = hora;
    }

    public String getData(){
        return data;
    } 

    public String getHora(){
        return hora;
    }

    public String toString(){
        return "Data: " + "\t" + "Hora: " + "\n";
    }
}
