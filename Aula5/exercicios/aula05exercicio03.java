package Aula5.exercicios;
import java.util.Scanner;
public class aula05exercicio03 {
    //Construir um algoritmo que leia um número inteiro e imprime a sequência:
    // – 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024. . .
    // – enquanto o valor da sequência for menor ou igual ao número lido.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char continuar;
        int numero;
        boolean repetir = true;

        while(repetir){
            int i = 1;
            System.out.println("Digite o número:");
            numero = entrada.nextInt();

            while(numero > i){
                if(i == 1){
                     System.out.print(i);
                } else {
                    System.out.printf(", %d", i);
                }
                i = i*2;
            }
            System.out.println();
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
