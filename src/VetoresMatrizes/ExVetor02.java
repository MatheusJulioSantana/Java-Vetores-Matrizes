package VetoresMatrizes;

import java.util.Scanner;

public class ExVetor02 {

    public static void main(String[] args) {
    	//variaveis
        int vetor[] = new int[10], soma = 0, i;
        float media;

        Scanner input = new Scanner(System.in);
        
        //Valores
        for (i = 0; i < 10; i++) {
            System.out.println("\n Insira o valor número " + (i + 1));
            vetor[i] = input.nextInt();
            soma += vetor[i];  
    }	//Identificação de indices impares e valores pares
        System.out.print("\nElementos dentro de índices ímpares: ");
        for (i = 1; i < 10; i += 2) {
            System.out.print(vetor[i] + " ");
        }
        System.out.print("\nElementos que são pares dentro dos indices: ");
        for(i=0; i<10; i++) {
        	if(vetor[i] % 2 == 0) {
        		System.out.print(+vetor[i]+" ");     
        	}
        }
        //Resultados
        System.out.println("\nSoma de todos os elementos: " + soma);
        media = soma / 10;
        System.out.println("Média de todos os elementos: " + media);
        	
        
}
}
