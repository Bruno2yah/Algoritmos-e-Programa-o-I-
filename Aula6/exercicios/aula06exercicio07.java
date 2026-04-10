package Aula6.exercicios;

import java.util.Scanner;

public class aula06exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade, contador50anos = 0, contadorMedia = 0, contadorPeso = 0;
        double altura, media = 0, peso, percentualPeso;

        for(int i = 1; i <= 10; i++){
            System.out.println("Digite a idade: ");
            idade = entrada.nextInt();

            System.out.println("Digite a altura: ");
            altura = entrada.nextDouble();

            System.out.println("Digite o peso: ");
            peso = entrada.nextDouble();

            if(idade>50){
                contador50anos++;
            }
            if(idade<=20 && idade>=10){
                contadorMedia++;
                media += altura;
            }
            if(peso<40){
                contadorPeso++;
            }
        }
        if(contador50anos > 0){
            System.out.println("A quantidade de pessoas com mais de 50 anos é: " + contador50anos);
        } else {
            System.out.println("Não tem pessoas com mais de 50 anos");
        }
        if(media > 0){
            media = media/contadorMedia;
            System.out.printf("A média das pessoas entre 10 e 20 anos é: %.2f%n", media);
        } else {
            System.out.println("Não tem pessoas entre 10 e 20 anos");
        }
        percentualPeso = (contadorPeso/10.0)*100;
        System.out.printf("A porcentagem de pessoas com peso inferior a 40 quilos é: %.2f%%", percentualPeso);

        entrada.close();
    }
}
