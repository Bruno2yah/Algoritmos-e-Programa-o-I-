package Aula7.exercicios;

import java.util.Scanner;

public class aula07exercicio01 {
    // Bruno Geanini dos Reis
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i=0; i<numeros.length; i++){
            System.out.println("Digite o número " + (i+1));
            numeros[i] = entrada.nextInt();
        }

        for (int i=0; i<numeros.length; i++){
            System.out.println("numero " + (i+1) + " = " + numeros[i]);
        }

        entrada.close();
    }
}
