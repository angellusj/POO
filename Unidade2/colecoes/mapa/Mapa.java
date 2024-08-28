package Unidade2.colecoes.mapa;

import java.util.TreeMap;

public class Mapa {
    public static void main(String[] args) {
        TreeMap<String, Integer> contador = new TreeMap<>();
        String texto = "Uma vez Flamengo sempre Flamengo Flamengo sempre eu hei de ser e meu maior prazer velo brilhar seja na terra seja no mar vencer vencer vencer uma vez Flamengo Flamengo ate morrer na regata ele me mata me maltrata me arrebata de emocao no coracao consagrado no gramado sempre amado o mais cotado no FlaFlu e o ai jesus eu teria um desgosto profundo se faltasse o Flamengo no mundo ele vibra ele e fibra muita libra ja pesou Flamengo ate morrer eu sou";
        String[] palavras = texto.split(" ");

        for (String palavra : palavras) {
            String palavraMinuscula = palavra.toLowerCase();
            if(contador.containsKey(palavraMinuscula)){
                int valor = contador.get(palavraMinuscula);
                contador.put(palavraMinuscula, valor+1);
                //
            }else{
                contador.put(palavraMinuscula, 1);
            }
        }

        //System.out.println(contador);
        for (String palavra : contador.keySet()) {
            System.out.println(palavra + " = " + contador.get(palavra));
        }
    }
}
