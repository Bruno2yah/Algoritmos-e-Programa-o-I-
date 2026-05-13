package Aula7.exercicios;

import java.util.Scanner;
import java.util.Arrays;

public class aula07exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        String texto = "";

        for (int i=0; i<numeros.length; i++){
            System.out.println("Digite o número " + (i+1));
            numeros[i] = entrada.nextInt();
        }

        int[] numerosFormatados = Arrays.stream(numeros).distinct().toArray();

        for (int i = 0; i < numerosFormatados.length; i++){
            if(numerosFormatados[i]%2 == 0){
                if (texto == ""){
                    texto = "Numeros Pares:\n" + numerosFormatados[i] + "\n";
                }
                else {
                    texto += numerosFormatados[i] + "\n";
                }
            }
        }
        if(texto == ""){
            System.out.println("Não tem números pares.");
        }
        else {
            System.out.println(texto);
            texto = "";
        }

        for (int i = 0; i < numerosFormatados.length; i++){
            if(numerosFormatados[i]%2 != 0){
                if (texto == ""){
                    texto = "Numeros Impares:\n" + numerosFormatados[i] + "\n";
                }
                else {
                    texto += numerosFormatados[i] + "\n";
                }
            }
        }

        if(texto == ""){
            System.out.println("Não tem números impares.");
        }
        else {
            System.out.println(texto);
        }

        entrada.close();
    }
}
