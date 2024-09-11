package exercicios.exerciciosArrays.agenda;

public class EntradaEmAgenda {
    private String hora, assunto;
    private int dia, mes, ano;

    public EntradaEmAgenda(String horario, String assuntoAgenda, int dia, int mes, int ano){
        hora = horario;
        assunto = assuntoAgenda;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getHora(){
        return hora;
    }

    public String getAssunto(){
        return assunto;
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    public void setHora(String hora){
        this.hora = hora;
    }

    public void setAssunto(String assunto){
        this.assunto = assunto;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public boolean ehNoDia(int dia, int mes, int ano){
        return (this.dia == dia) && (this.mes == mes) && (this.ano == ano);
    }

    public String toString(){
        String data = dia + "/" + mes + "/" + ano;
        
        return data + " " + hora + "\n" + assunto;
    }
}
