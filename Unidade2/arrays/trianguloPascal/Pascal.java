package Unidade2.arrays.trianguloPascal;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nlinhas;

        System.out.print("Numero de linahs: ");
        nlinhas = sc.nextInt();
        int tri[][] = new int[nlinhas][];

        for (int l = 0; l < tri.length; l++){
            tri[l] = new int[l+2];
            tri[l][0] = 1;
            tri[l][tri[l].length-1] = 1;
            for (int c = 1; c < tri[l].length-1; c++){
                tri[l][c] = tri[l-1][c] + tri[l-1][c-1];
            }
        }

        for(int l = 0; l < tri.length; l++){
            for(int c = 0; c < tri[l].length; c++){
               System.out.print(tri[l][c] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
