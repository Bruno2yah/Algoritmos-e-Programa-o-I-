import java.util.Scanner;
public class exercicio12 {
    public static void main(String[] args) {
        // Bruno Geanini dos Reis
        Scanner entrada = new Scanner(System.in);
        
        double salario, desconto;
        
        System.out.println("Digite o salário");
        salario = entrada.nextDouble();
        
        if (salario <= 600.00){
            System.out.println("INSS Isento");
        }
        else if(salario <= 1200.00){
            desconto = salario*0.20;
            System.out.printf("o desconto é de 20%% equivalente a: %.2f", desconto);
        }
        else if(salario <= 2000.00){
            desconto = salario*0.25;
            System.out.printf("o desconto é de 25%% equivalente a: %.2f", desconto);
        }
        else{
            desconto = salario*0.30;
            System.out.printf("o desconto é de 30%% equivalente a: %.2f", desconto);
        }
        entrada.close();
    }
}
