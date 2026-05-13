package Aula7.exercicios;

import java.util.Scanner;

public class aula07exercicio05 {
    public static void main(String[] args) {
        // Bruno Geanini dos Reis
        Scanner entrada = new Scanner(System.in);

        int tamanhoVetor = 5;
        int[] A = new int[tamanhoVetor];
        int[] B = new int[tamanhoVetor];
        int[] C = new int[tamanhoVetor];

        for (int i=0; i<tamanhoVetor; i++){
            System.out.println("Digite o número " + (i+1) + " do vetor A");
            A[i] = entrada.nextInt();
            System.out.println("Digite o número " + (i+1) + " do vetor B");
            B[i] = entrada.nextInt();
        }

        System.out.println("Elementos do vetor C:");
        String textoVetor = "";
        for (int i = 0; i<tamanhoVetor; i++){
            C[i] = A[i]-B[i];
            textoVetor += C[i] + " ";
        }

        System.out.println(textoVetor);

        entrada.close();
    }
}
