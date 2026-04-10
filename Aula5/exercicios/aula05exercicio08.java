package Aula5.exercicios;

import java.util.Scanner;

public class aula05exercicio08 {
      // Bruno Geanini dos Reis
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char continuar;
        double nota1, nota2, media;
        boolean repetir = true, repetirNota;

        while(repetir){
            int i=1;
            double notaAlunos = 0;

            while(i<=5){
                System.out.printf("Dados do %d° aluno:%n", i);
                
                do {
                    System.out.println("Digite a primeira nota: ");
                    nota1 = entrada.nextDouble();
                    if(nota1 < 0 || nota1 > 10){
                        repetirNota = true;
                        System.out.println("Valor inválido! Digite um valor entre 0 e 10");
                    } else{
                        repetirNota = false;
                    }
                } while(repetirNota);
                do {
                    System.out.println("Digite a segunda nota: ");
                    nota2 = entrada.nextDouble();
                    if(nota2 < 0 || nota2 > 10){
                        repetirNota = true;
                        System.out.println("Valor inválido! Digite um valor entre 0 e 10");
                    } else{
                        repetirNota = false;
                    }
                } while(repetirNota);

                notaAlunos += nota1 + nota2;
                i++;
            }
            media = notaAlunos/10;
           
            System.out.printf("A média dos 5 alunos é: %.2f%n", media);
            System.out.println("Deseja continuar? s/n");
            continuar = entrada.next().charAt(0);
            continuar = Character.toUpperCase(continuar);

            if(continuar != 'S'){
                repetir = false;
                System.out.println("Programa encerrado");
            }
        }
            entrada.close();
    }
}
