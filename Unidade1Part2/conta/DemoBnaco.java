package Unidade1Part2.conta;

public class DemoBnaco {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Marcia Fu", 24435.43, true);
        System.out.println(conta1);
        ContaBancaria conta2 = new ContaBancaria("Glaydson");
        System.out.println(conta2);
    }
}
