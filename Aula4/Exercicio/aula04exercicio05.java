import java.util.Scanner;
import java.lang.Math;

public class aula04exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char operacao, continuar;
        double numero1, numero2, resultado;
        boolean repetir = true;

        while(repetir){
            System.out.printf("Digite o primeiro número: ");
            numero1 = entrada.nextDouble();

            System.out.printf("Digite o segundo número: ");
            numero2 = entrada.nextDouble();

            System.out.printf("Digite a operação:%nM - Média entre os números digitados%nS - diferença do maior pelo menor%nP - produto entre os números digitados%nD - Divisão do primeiro para o segundo%n");
            operacao = entrada.next().charAt(0);
            operacao = Character.toUpperCase(operacao);
    
            switch (operacao) {
                case 'M':
                    resultado = (numero1+numero2)/2;
                    System.out.printf("A média é %.2f%n", resultado);
                    break;
                case 'S':
                    resultado = Math.abs(numero1 - numero2);
                    System.out.printf("A diferença é %.2f%n", resultado);
                    break;
                case 'P':
                    resultado = numero1 * numero2;
                    System.out.printf("O produto é: %.2f%n", resultado);
                    break;
                case 'D':
                        if(numero2 == 0){
                            System.out.println("Impossivel dividir por 0");
                        } else {
                            resultado = numero1 / numero2;
                            System.out.printf("O resultado da divisão é: %.2f%n", resultado);
                        }
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
                }
            
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
