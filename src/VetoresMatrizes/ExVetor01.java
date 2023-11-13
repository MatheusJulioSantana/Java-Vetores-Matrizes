package VetoresMatrizes;

import java.util.Scanner;

public class ExVetor01 {

    public static void main(String[] args) {
    	//variaveis
        int palpite, x, posicao = -1;
        int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        
        Scanner input = new Scanner(System.in);
        
        //Palpite
        System.out.println("\nDigite o número a ser pesquisado: ");
        palpite = input.nextInt();
        
        //verificar palpite
        for (x = 0; x < 10; x++) {
            if (vetor[x] == palpite) {
                posicao = x;
                break;
            }
        }
        if (posicao >= 0) {
            System.out.println("\nO número " + palpite + " foi encontrado na posição " + posicao);
        } else {
            System.out.println("\nNão foi encontrado.");
        }
    }
}
