package Unidade2.media;

public class Media {
    public static void main(String[] args) {
        System.out.println(media(2.5, 3.0));
    }
    public static double media(double...numeros){
        double soma = 0.0, media;

        for(double d : numeros){
            soma += d;
        }
        media = soma/numeros.length;
        return media;
    }
}
