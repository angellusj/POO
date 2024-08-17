package exercicios.exReuso.emprego;

public class Tecnico extends Assistente{
    private double bonus;

    public Tecnico(String nome, double salario, int matricula, double bonus){
        super(nome, salario, matricula);
        this.bonus = bonus;
    }

    public double ganhoAnual(){
        double salarioAnual = getSalario() * 12;
        double decimoTerceiro = getSalario() + bonus;
        return salarioAnual + decimoTerceiro;
    }

    public double getBonus(){
        return bonus;
    }

    public String toString(){
        return super.toString() + "Bonus salarial: " + bonus + "\n";
    }
}
