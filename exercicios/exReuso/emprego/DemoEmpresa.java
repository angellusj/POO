package exercicios.exReuso.emprego;

public class DemoEmpresa {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Yasmim", 3.467);
        Assistente assistente = new Assistente("Julia", 4.654, 40028922);
        Tecnico tecnico = new Tecnico("Anginha", 13.478, 202866548, 2.543);
        Adiministrativo adm = new Adiministrativo("Mario", 20.687, 202756884, "Noite", 1.244);

        System.out.println(funcionario);
        System.out.println("Aumento salarial: " + funcionario.aumentarSalario(2.234));
        System.out.println("Ganho Anual: " + funcionario.ganhoAnual());
        System.out.println("-------------------------------------------------------------------");

        System.out.println(assistente);
        System.out.println("-----------------------------------------------------------------");

        System.out.println(tecnico);
        System.out.println("Ganho anual: " + tecnico.ganhoAnual());
        System.out.println("---------------------------------------------------------------------");

        System.out.println(adm);
        System.out.println("Ganho anual: " + adm.ganhoAnual());
    }
}
