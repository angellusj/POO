package Unidade2.reuso.posGraduacao;

import Unidade2.reuso.RegistroAcademico;

public class DemoPos {
    RegistroAcademico aluno1 = new RegistroAcademico("Mario", "40028922bdec", "Bacharelado em Muitas Coisas");
    RegistroAcademicoPosGraduacao alunoPos1 = new RegistroAcademicoPosGraduacao(aluno1, "voce pensa que o flamengo e time", "italo");
    System.out.println(alunoPos1);
}
