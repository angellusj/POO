package exercicios.exReuso.politica;

public class DemoPolitica {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Loeyka", 34);
        Politico politico = new Politico("Mario", 45, "PSOL");
        Prefeito prefeito = new Prefeito("Maria Elce", 52, "PT", "Major Sales");
        Governador governador = new Governador("Giorgian DeArrascaeta", 34, "FLA", "Rio de Janeiro");

        System.out.println(pessoa);
        System.out.println(politico);
        System.out.println(prefeito);
        System.out.println(governador);
    }
}
