package Aula5.exercicios;
import java.util.Scanner;
public class aula05exercicio06 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char continuar;
        int numero;
        boolean repetir = true;

        while(repetir){
            int menorNumero = -1, i=1;
            while (i<=10) {
                System.out.println("Digite o número: ");
                numero = entrada.nextInt();
                if(menorNumero == -1){
                    menorNumero = numero;
                } 
                else if(numero < menorNumero) {
                    menorNumero = numero;
                };
                i++;
            }
            System.out.println("O menor número é: " + menorNumero);

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
