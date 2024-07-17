package Unidade1part1.aulaClasses.triangulo;

public class Triangulo {
    private double l1, l2, l3;
    private String desc;

    public void inicializador(double lado1, double lado2, double lado3, String descricao) {
        l1 = lado1;
        l2 = lado2;
        l3 = lado3;
        desc = descricao;
    }

    public double perimetro(){
        return (l1+l2+l3);
    }
}
