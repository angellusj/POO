package Unidade2.reuso.posGraduacao;

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
        return gradInfo.toString() + "Tese: " + tituloTese + "; Orientador: " + orientador;
    }
}
