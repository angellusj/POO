package Unidade2.reuso.posGraduacao;

public class RegistroAcademico {
    private String nomeDoAluno;
    private String matricula;
    private String curso;

    public RegistroAcademico(String nome, String matricula, String curso){
        nomeDoAluno = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String toString(){
        return "Nome: " + nomeDoAluno + "; Matricula: " + matricula + "; Curso: " + curso;
    }
}
