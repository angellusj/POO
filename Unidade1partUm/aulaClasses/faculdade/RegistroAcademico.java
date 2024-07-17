package Unidade1partUm.aulaClasses.faculdade;

public class RegistroAcademico {
    String nome, matricula;
    int codigoCurso;
    double percentualCobranca;

    void inicializaRegistro (String n, String m, int c, double p){
        nome = n;
        matricula = m;
        codigoCurso = c;
        percentualCobranca = p;
    }

    double calculaMensalidade(){
        return 100*codigoCurso*percentualCobranca;
    }
}
