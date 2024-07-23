package Unidade1Part2.igualdade;

public class TesteIgualdade {
    public static void main(String[] args) {
        Integer i1 = 2;
        Integer i2 = 3;
        System.out.println(Engual.enguals(i1, i2));

        Double d1 = 2.0;
        Double d2 = 3.0;
        System.out.println(Engual.enguals(d1, d2));

        String s1 = "3.0";
        String s2 = "2.0";
        System.out.println(Engual.enguals(s1, s2));
    }
}
