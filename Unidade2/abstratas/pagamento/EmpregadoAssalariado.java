package Unidade2.abstratas.pagamento;

public class EmpregadoAssalariado extends Empregado{
    private double salario;

    public EmpregadoAssalariado(double salario, String nome, String ctps) {
        super(nome, ctps);
        this.salario = salario;
    }

    public double valorDoPagamento(){
        return salario;
    }

}
