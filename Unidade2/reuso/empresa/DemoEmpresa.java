package Unidade2.reuso.empresa;

public class DemoEmpresa {
    public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Mario", "40028922");
    System.out.println(pessoa);

    Funcionario funcionario = new Funcionario("Mariana", "40022966", 5.548);
    System.out.println(funcionario);

    ChefeDepartamento chefe = new ChefeDepartamento("Marta", "40026877", 15.485, "Financeiro");
    System.out.println(chefe);
    
    }
}
