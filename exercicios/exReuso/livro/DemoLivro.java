package exercicios.exReuso.livro;

public class DemoLivro {
    public static void main(String[] args) {
        LivroLivraria livraria = new LivroLivraria("Sangue e fogo", "George R.R. Martin", 40028922, "Suma", "Janina", 104.90, 36);
        LivroBiblioteca biblioteca = new LivroBiblioteca("Sangue e fogo", "George R.R. Martin", 49088372, "Suma", "Real Gabinete Portugues de Leitura", true, 90);

        System.out.println(livraria);
        System.out.println(biblioteca);
    }
}
