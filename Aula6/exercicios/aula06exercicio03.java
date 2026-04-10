package Aula6.exercicios;

import java.util.Scanner;

public class aula06exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número");
        int numero = entrada.nextInt();

        for(int i = 1; i<=numero; i++){
            System.out.print(i + " ");
        }

        entrada.close();
    }
}
