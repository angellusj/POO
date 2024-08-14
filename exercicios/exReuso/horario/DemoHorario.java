package exercicios.exReuso.horario;

public class DemoHorario {
    public static void main(String[] args) {
        //EventoDelegacao eveDel = new EventoDelegacao("14/08/2024 17:45", "Producao de codigos em java");

        EventoHeranca eveHer = new EventoHeranca("14/08/2024", "17:47", "Producao de codigos em java");
        System.out.println(eveHer);
    }
}
