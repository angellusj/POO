package Unidade1partUm.aulaClasses.triangulo;

public class Triangulo {
    double l1, l2, l3;
    String desc;

    void inicializador(double lado1, double lado2, double lado3, String descricao) {
        l1 = lado1;
        l2 = lado2;
        l3 = lado3;
        desc = descricao;
    }

    double perimetro(){
        return (l1+l2+l3);
    }
}
