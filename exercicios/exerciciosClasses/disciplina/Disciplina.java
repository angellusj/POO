package exercicios.exerciciosClasses.disciplina;

public class Disciplina {
    int matricula;
    String nome;
    double prova1, prova2, trabalho, exameFinal;

    public Disciplina(int matricula, String nome, double p1, double p2, double t, double exameFinal) {
        this.matricula = matricula;
        this.nome = nome;
        prova1 = p1;
        prova2 = p2;
        trabalho = t;
        this.exameFinal = exameFinal;
    }

    public double media(double prova1, double prova2, double trabalho) {
        return ((2.5 * prova1) + (2.5 * prova2) + (2 * trabalho)) / 7;
    }

    public double provaFinal(double exameFinal) {
        double mp = media(prova1, prova2, trabalho);
        double mf = ((mp * 6) + (exameFinal * 4)) / 10;
        if (mp <3 || mp >= 7) {
            System.out.println("Você está passado pela média parcial!");
        } else if (mf >= 5) {
            System.out.println("Sua média final foi: " + mf + ", você está aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
        return 0;
    }

    public void dadosDisciplina() {
        System.out.println("Aluno: " + nome + " Matricula: " + matricula);
        System.out.println("Média parcial: " + media(prova1, prova2, trabalho));
        provaFinal(exameFinal);
    }

}
