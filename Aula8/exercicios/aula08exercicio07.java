package exercicios;

import java.util.Scanner;

public class aula08exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        char continuar;

        while(true){
           
            System.out.println("Digite o valor que deseja calcular o fatorial");
            numero = entrada.nextInt();
            entrada.nextLine();

            System.out.println("O valor fatorial de " + numero + "! é: " + calcularFatorial(numero));

            System.out.println("Digite S/s para sair (digite qualquer outra tecla para continuar)");
            continuar = entrada.next().charAt(0);
            
            if(continuar == 's' || continuar == 'S'){
                    break;
            }
        }

        entrada.close();
    }
    public static int calcularFatorial(int numero){
        int fatorial = 1;
        for(int i=numero; i>1; i--){
            System.out.println(i + " =  valor fatorial: " + fatorial);
            fatorial *= i;
        }
        return fatorial;
    }
}
