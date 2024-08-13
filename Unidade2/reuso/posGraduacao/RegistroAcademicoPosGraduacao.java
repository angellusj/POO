package Unidade2.reuso.posGraduacao;

import Unidade2.reuso.RegistroAcademico;

public class RegistroAcademicoPosGraduacao {
    private RegistroAcademico gradInfo;
    private String tituloTese;
    private String orientador;

    public RegistroAcademicoPosGraduacao(RegistroAcademico gradInfo, String tituloTese, String orientador){
        this.gradInfo = gradInfo;
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }

    public String toString(){
        return "Tese: " + tituloTese + "; Orientador: " + orientador;
    }
}
