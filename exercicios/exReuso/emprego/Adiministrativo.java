package exercicios.exReuso.emprego;

public class Adiministrativo extends Assistente{
    private String turno;
    private double adicionalNoturno;

    public Adiministrativo(String nome, double salario, int matricula, String turno, double adicionalNoturno){
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public double ganhoAnual(){
        double salarioAnual = getSalario() * 12 + (turno.equalsIgnoreCase("noite")?adicionalNoturno*12:0);
        double decimoTerceiro = getSalario();
        return salarioAnual + decimoTerceiro;
    }

    public String getTurno(){
        return turno;
    }

    public double getAdicionalNoturno(){
        return adicionalNoturno;
    }

    public String toString(){
        return super.toString() + "Turno: " + turno + "\t" + "Adicional noturno: " + adicionalNoturno + "\n";
    }
}
