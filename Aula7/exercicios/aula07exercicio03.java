package Aula7.exercicios;

import java.util.Scanner;

public class aula07exercicio03 {
    public static void main(String[] args) {
        // Bruno Geanini dos Reis
        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[5];

        for(int i = 0; i< nomes.length; i++){
            System.out.println("Digite o nome da " + (i+1) + "° pessoa:");
            nomes[i] = entrada.nextLine();
        }

        System.out.println("Apresentando os nomes do último para o primeiro: ");
        for(int i = (nomes.length - 1); i>=0; i--){
            System.out.println(nomes[i]);
        }

        System.out.println("primeiro nome armazenado: " + nomes[0]);
        System.out.println("ultimo nome armazenado: " + nomes[nomes.length-1]);

        entrada.close();
    }
}
