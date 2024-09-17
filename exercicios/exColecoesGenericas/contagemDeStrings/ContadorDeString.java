package exercicios.exColecoesGenericas.contagemDeStrings;

import java.util.Map;
import java.util.TreeMap;

public class ContadorDeString {
    public static void main(String[] args) {
        String input = "E NO RIO NAO TEM OUTRO IGUAL SO O FLAMENGO EH CAMPEAO MUNDIAL";

        Map<Character, Integer> contadorDeString = new TreeMap<>();

        for(char c: input.toCharArray()){
            if((Character.isLetter(c))){
                contadorDeString.put(c, contadorDeString.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Contagem de frequencia das letras: ");
        for(Map.Entry<Character, Integer> entry : contadorDeString.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
