import java.util.Scanner;
public class aula3exercicio4 {
    public static void main(String[] args) {
        // Bruno Geanini dos Reis
        Scanner entrada = new Scanner(System.in);
        
        float numero1, numero2;

        System.out.println("DIgite o primeiro numero: ");
        numero1 = entrada.nextFloat();
        System.out.println("DIgite o segundo numero: ");
        numero2 = entrada.nextFloat();

        if(numero1 > numero2){
            System.out.printf("1- %.2f%n2- %.2f", numero1, numero2);
        }
        else if(numero1 == numero2){
            System.out.println("Números iguais");
        }
        else {
            System.out.printf("1- %.2f%n2- %.2f", numero2, numero1);
        }

        entrada.close();
    }
}
