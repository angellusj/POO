package Unidade2.abstratas.pagamento;

public class DemoPagamento {
    public static void main(String[] args) {
        Fatura fatura = new Fatura(2.5, 4);
        EmpregadoAssalariado assalariado = new EmpregadoAssalariado(2.500, "Mario", "sdh25615");
        imprimirPagamento(fatura);
        imprimirPagamento(assalariado);
    }

    public static void imprimirPagamento(Pagavel pagavel) {
        System.out.println("Valor do pagamento: " + pagavel.valorDoPagamento());
    }
}
