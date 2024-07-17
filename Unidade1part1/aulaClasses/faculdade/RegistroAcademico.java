package Unidade1part1.aulaClasses.faculdade;

public class RegistroAcademico {
    private String nome, matricula;
    private int codigoCurso;
    private double percentualCobranca;

    public void inicializaRegistro (String n, String m, int c, double p){
        nome = n;
        matricula = m;
        codigoCurso = c;
        percentualCobranca = p;
    }

    public double calculaMensalidade(){
        return 100*codigoCurso*percentualCobranca;
    }
}
