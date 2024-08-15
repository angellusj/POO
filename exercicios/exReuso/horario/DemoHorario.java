package exercicios.exReuso.horario;

public class DemoHorario {
    public static void main(String[] args) {
        DataHora datho = new DataHora(15, 8, 2024, 12, 55);
        EventoDelegacao eveDel = new EventoDelegacao(datho, "Producao de codigos em java");
        System.out.println(eveDel);

        EventoHeranca eveHer = new EventoHeranca(15, 8, 2024, 12, 55, "Producao de codigos em Java");
        System.out.println(eveHer);
    }
}
