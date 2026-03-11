import java.util.Scanner;
public class aula3exercicio9 {
    public static void main(String[] args) {
        // Bruno Geanini dos Reis
        Scanner entrada = new Scanner(System.in);

        double salario, prestacao;

        System.out.println("Digite o salário bruto: ");
        salario = entrada.nextDouble();

        System.out.println("Digite o valor da prestação");
        prestacao = entrada.nextDouble();

        if(prestacao > salario*0.30){
            System.out.println("Empréstimo não poderá ser concedido!");
        }
        else{
            System.out.println("Empréstimo pode ser concedido!");
        }
        entrada.close();
    }
}
