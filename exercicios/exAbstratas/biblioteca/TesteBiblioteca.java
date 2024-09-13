package exercicios.exAbstratas.biblioteca;

public class TesteBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca("O Manifesto Comunista", "Karl Marx & Friedrich Engels", 68, 1848, false, "Politica", "5", "O livro apresenta as bases da teoria marxista e uma análise crítica do capitalismo. Ele propõe que a história da sociedade é a história da luta de classes, argumentando que a classe trabalhadora (o proletariado) deve se unir para derrubar a burguesia (classe dominante) e criar uma sociedade sem classes e sem propriedade privada, baseada no comunismo. O manifesto também aponta as contradições do capitalismo e prevê sua eventual superação por um sistema mais justo e igualitário.");

        System.out.println(livro);

        livro.empresta();
        System.out.println(livro);

        livro.devolve();
        System.out.println(livro);
    }
}
