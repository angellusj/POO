package exercicios.exAbstratas.empresa;

public class DemoFuncionario {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Angela");
        Funcionario func2 = new Funcionario("Maria", 7.0);
        System.out.println(func);
        System.out.println(func2);
    }
}
