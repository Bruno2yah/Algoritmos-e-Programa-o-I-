package Aula5.exercicios;

import java.util.Scanner;

public class aula05exercicio07 {
      // Bruno Geanini dos Reis
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char continuar;
        double peso, imc, altura, alturaMetro;
        boolean repetir = true;

        while(repetir){
            int i=1, semObesidade = 0;
            while (i<10){
                System.out.printf("Dados da %d° pessoa:%nDigite a Altura em centimetros:%n", i);
                altura = entrada.nextInt();
                System.out.println("Digite o peso em KG");
                peso = entrada.nextDouble();

                alturaMetro = altura/100.0;

                imc = peso/(alturaMetro*alturaMetro);

                if(imc >= 18.5 && imc <= 24.99){
                    semObesidade++;
                }
                i++;
            }

            System.out.printf("A quantidade de pessoas sem obesidade é: %d%n", semObesidade);
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
