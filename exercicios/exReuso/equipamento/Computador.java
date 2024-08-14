package exercicios.exReuso.equipamento;

public class Computador extends Equipamento{
    private String processador;
    private String memoria;

    public Computador(String nome, String marca, String processador, String mem){
        super(nome, marca);
        this.processador = processador;
        memoria = mem;
    }

    public String getProcessador(){
        return processador;
    }

    public void setProcessador(String processador){
        this.processador = processador;
    }

    public String getMem(){
        return memoria;
    }

    public void setMem(String memoria){
        this.memoria = memoria;
    }

    public String toString(){
        return super.toString() + "\n" + "Processador: " + processador + "\n" + "Memoria: " + memoria + "\n";
    }
}
