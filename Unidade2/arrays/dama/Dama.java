package Unidade2.arrays.dama;

public class Dama {
    private char tabuleiro[][];
    private final static int NL = 8;
    private final static int NC = 8;

    public Dama(){
        tabuleiro = new char[NL][NC];

        for(int l = 0; l < tabuleiro.length; l++){
            for(int c = 0; c < tabuleiro[l].length; c++){
                tabuleiro[l][c] = '.';
            }
        }
        //time x
        for(int l = 0; l <= 2; l++){
            for(int c = (l%2==0?1:0); c < tabuleiro[l].length; c+=2){
                tabuleiro[l][c] = 'x';
            }
        }

        for(int l = 5; l <= 7; l++){
            for(int c = (l%2==0?1:0); c < tabuleiro[l].length; c+=2){
                tabuleiro[l][c] = 'o';
            }
        }
    }

    public String toString(){
        String res = "";

        for(int l = 0; l < NL; l++){
            for(int c = 0; c < NC; c++){
               res += tabuleiro[l][c];
               res += "  ";
            }
            res += "\n";
        }

        return res;
    }
}