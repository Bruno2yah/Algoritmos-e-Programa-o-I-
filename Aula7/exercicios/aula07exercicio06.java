package Aula7.exercicios;

import java.util.Scanner;

public class aula07exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoVetorA = 4, tamanhoVetorB = 7, tamanhoVetorC = tamanhoVetorA + tamanhoVetorB, divisaoAB = tamanhoVetorA;
        int[] A = new int[tamanhoVetorA];
        int[] B = new int[tamanhoVetorB];
        int[] C = new int[tamanhoVetorC];
        String textoVetor = "";

        for (int i=0; i<tamanhoVetorA; i++){
            System.out.println("Digite o número " + (i+1) + " do vetor A");
            A[i] = entrada.nextInt();
        }
        for (int i=0; i<tamanhoVetorB; i++){
            System.out.println("Digite o número " + (i+1) + " do vetor B");
            B[i] = entrada.nextInt();
        }

        for (int i = 0; i <tamanhoVetorA; i++){
            C[i] = A[i];
        }
        for (int i = 0; i < tamanhoVetorB; i++){
            C[divisaoAB] = B[i];
            divisaoAB++;
        }

        for(int i=0; i<tamanhoVetorC; i++){
            textoVetor += C[i] + " " ;
        }
        System.out.println(textoVetor);
        entrada.close();
    }
}
