package exercicios;
import java.util.Scanner;

public class aula08exercicio04 {
    public static void main(String[] args) {
        // Bruno Geanini dos Reis
        Scanner entrada = new Scanner(System.in);

        int numero;
        char continuar;
        boolean par;

        while(true){
            System.out.println("Digite o número: ");
            numero = entrada.nextInt();
            entrada.nextLine();
            
            par = isPar(numero);
            
            if(par){
                System.out.println(numero + " é um número par");
            } else {
                System.out.println(numero + " é um número impar");
            }

            System.out.println("Digite S/s para sair (digite qualquer outra tecla para continuar)");
            continuar = entrada.next().charAt(0);
            
            if(continuar == 's' || continuar == 'S'){
                    break;
            }
        }

        entrada.close();
    }
    public static boolean isPar(int numero){
        if(numero%2== 0){
            return true;
        }
        else {
            return false;
        }
    }
}
