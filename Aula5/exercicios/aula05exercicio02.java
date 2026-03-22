package Aula5.exercicios;
import java.util.Scanner;
public class aula05exercicio02 {
    // Faça um algoritmo que leia 10 números inteiros e diga: quantos são pares; e quantos são ímpares.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char continuar;
        boolean repetir = true;

        while(repetir){
            int i=1, numero, quantidadePar = 0, quantidadeImpar = 0;
            
            while(i<=10){
                System.out.println("Informe o número: ");
                numero = entrada.nextInt();
                
                if(numero%2 == 0){
                    quantidadePar++;
                } else {
                    quantidadeImpar++;
                }
                i++;
            }
            System.out.println("A quantidade de números pares são: " + quantidadePar);
            System.out.println("A quantidade de números impares são: " + quantidadeImpar);

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
