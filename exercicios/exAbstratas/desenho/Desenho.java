package exercicios.exAbstratas.desenho;

import exercicios.exAbstratas.figuras.FiguraGeomatrica;

public class Desenho {
    private FiguraGeomatrica figura1;
    private FiguraGeomatrica figura2;
    private int x1, x2;
    private int y1, y2;

    public Desenho(FiguraGeomatrica figura1, FiguraGeomatrica figura2, int x1, int x2, int y1, int y2){
        this.figura1 = figura1;
        this.figura2 = figura2;

        this.x1 = x1;
        this.x2 = x2;

        this.y1 = y1;
        this.y2 = y2;
    }

    public void apresenta(){
        System.out.println("Figura 1: ");
        figura1.descricao();
        System.out.println("Nas coordenadas: ");
        System.out.println("X: " + x1 + " " + "Y: " + y1);

        System.out.println("Figura 2: ");
        figura2.descricao();
        System.out.println("Nas coordenadas: ");
        System.out.println("X: " + x2 + " " + "Y: " + y2);
    }
}
