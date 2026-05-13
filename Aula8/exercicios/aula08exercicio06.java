package exercicios;

import java.util.Scanner;

public class aula08exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numero = new int[5];
        char continuar;

        while(true){

            for (int i = 0; i < numero.length; i++) {
                System.out.println("Digite o valor da posição " + (i+1) + ": ");
                numero[i] = entrada.nextInt();
                entrada.nextLine();
            }

            System.out.println("O maior valor é: " + max(numero));
            System.out.println("O menor valor é: " + min(numero));
            System.out.println("O ponto médio é: " + pontoMedio(numero));
           
            System.out.println("Digite S/s para sair (digite qualquer outra tecla para continuar)");
            continuar = entrada.next().charAt(0);
            
            if(continuar == 's' || continuar == 'S'){
                    break;
            }
        }

        entrada.close();
    }
    public static int max(int[] numero){
        int maiorValor = numero[0];
        for (int i : numero) {
            if(maiorValor < i){
                maiorValor = i;
            }
        }
        return maiorValor;
    }
    public static int min(int[] numero){
        int menorValor = numero[0];
        for (int i : numero){
            if(menorValor > i){
                menorValor = i;
            }
        }
        return menorValor;
    }
    public static double pontoMedio(int[] numero){
        int maiorValor = max(numero);
        int menorValor = min(numero);

        return (maiorValor + menorValor)/2.0; 
    }
}
