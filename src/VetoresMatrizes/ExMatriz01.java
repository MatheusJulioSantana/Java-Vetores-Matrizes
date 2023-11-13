package VetoresMatrizes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExMatriz01 {

    public static void main(String[] args) {
    	//variaveis 
        int matriz[][] = new int[3][3];
        int linha, coluna, somaDiagP = 0, somaDiagS = 0;
        List<Integer> itensDiagP = new ArrayList<>();
        List<Integer> itensDiagS = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        //valores
        for (linha = 0; linha < 3; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {
                System.out.println("\nEntre com um número na posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Soma e elementos da diagonal principal e secundaria
        for (linha = 0; linha < 3; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {
                if (linha == coluna) {
                    somaDiagP += matriz[linha][coluna];
                    itensDiagP.add(matriz[linha][coluna]);
                }
                if ((linha + coluna) == 2) {
                    somaDiagS += matriz[linha][coluna];
                    itensDiagS.add(matriz[linha][coluna]);
                }
            }
        }

        // Resultados
        System.out.println("\nSoma da diagonal principal: " + somaDiagP);
        System.out.println("Soma da diagonal secundária: " + somaDiagS);
        System.out.println("\nItens da diagonal principal: " + itensDiagP);
        System.out.println("Itens da diagonal secundária: " + itensDiagS);
    }
}
