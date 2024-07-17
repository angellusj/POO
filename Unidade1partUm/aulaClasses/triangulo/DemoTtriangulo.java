package Unidade1partUm.aulaClasses.triangulo;

public class DemoTtriangulo {
    public static void main(String[] args){
        Triangulo t1, t2, t3;
        t1 = new Triangulo();
        t1.inicializador(3, 4, 5, "triangulo retangulo");
        t2 = new Triangulo();
        t2.inicializador(3, 4, 5, "triangulo retangulo");
        t3 = new Triangulo();
        t3 = t1;
        System.out.println(t1 == t2);
        System.out.println(t1 == t3);
    }
}
