package exercicios;
import java.util.Scanner;
public class aula08exercicio03 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, continuar;


        while(true){
            System.out.println("Digite o primeiro número: ");
            numero1 = entrada.nextInt();
            System.out.println("Digite o segundo número");
            numero2 = entrada.nextInt();

            System.out.println(encontrarMax(numero1, numero2));

            System.out.println("Digite 1 para continuar");
            continuar = entrada.nextInt();

            if(continuar != 1){
                    break;
            }
        }

        entrada.close();
    }
    public static int encontrarMax(int numero1, int numero2){
        if(numero1 > numero2){
            return numero1;
        } else {
            return numero2;
        }
    }
}
