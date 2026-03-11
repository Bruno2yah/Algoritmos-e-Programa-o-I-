import java.util.Scanner;
public class aula3exercicio1{
    // Bruno Geanini dos Reis
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        double numeroFinal;

        System.out.println("Digite um número inteiro: ");
        numero = entrada.nextInt();

        if(numero>20){
            numeroFinal = numero/2.0;
            System.out.printf("o número %d é maior do que 20, a metade dele é: %.2f", numero, numeroFinal);
        }
        else{
            System.out.printf("O número: %d não é maior que 20", numero);
        }
        entrada.close();
    }
}