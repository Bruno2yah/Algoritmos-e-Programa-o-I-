import java.util.Scanner;
public class aula3exercicio13 {
    public static void main(String[] args) {
        // Bruno Geanini dos Reis
        Scanner entrada = new Scanner(System.in);

        double numero1, numero2, resultado;
        char operacao;
        
        System.out.println("Digite o primeiro valor");
        numero1 = entrada.nextDouble();
        System.out.println("Digite o segundo valor");
        numero2 = entrada.nextDouble();
        System.out.printf("Digite a operação%n'+' - Soma%n'-' - Subtração%n'*' - Multiplicação%n'/' - Divisão%n");
        operacao = entrada.next().charAt(0);

        if(operacao == '+'){
            resultado = numero1 + numero2;
            System.out.printf("O resultado de %.2f + %.2f é igual a: %.2f", numero1, numero2, resultado);
        }
        else if (operacao == '-'){
            resultado = numero1 - numero2;
            System.out.printf("O resultado de %.2f - %.2f é igual a: %.2f", numero1, numero2, resultado);
        }
        else if (operacao == '*'){
            resultado = numero1 * numero2;
            System.out.printf("O resultado de %.2f x %.2f é igual a: %.2f", numero1, numero2, resultado);
        }
        else if (operacao == '/'){
            if(numero2 <= 0){
                System.out.println("Impossivel dividir, divisor menor ou igual a 0");
            } 
            else {
                resultado = numero1 / numero2;
                System.out.printf("O resultado de %.2f / %.2f é igual a: %.2f", numero1, numero2, resultado);
            }
        }
        entrada.close();
    }
}
