package Aula7.exercicios;

import java.util.Scanner;

public class aula07exercicio04 {
    public static void main(String[] args) {
        // Bruno Geanini dos Reis
        Scanner entrada = new Scanner(System.in);

        int tamanhoVetor = 5;
        int[] A = new int[tamanhoVetor];
        int[] B = new int[tamanhoVetor];

        for (int i=0; i<tamanhoVetor; i++){
            System.out.println("Digite o número " + (i+1));
            A[i] = entrada.nextInt();
        }

        System.out.println("Elementos do vetor B:");
        String textoVetor = "";
        for (int i = 0; i<tamanhoVetor; i++){
            B[i] = A[i]*3;
            textoVetor += B[i] + " ";
        }

        System.out.println(textoVetor);

        entrada.close();
    }
}
