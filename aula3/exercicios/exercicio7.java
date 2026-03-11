import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {
        // Bruno Geanini dos Reis
        Scanner entrada = new Scanner(System.in);

        int tempoEmpresaAno;
        double salario, valorBonus;

        System.out.println("Digite o salário: ");
        salario = entrada.nextDouble();
        System.out.println("Digite a quantidade de anos de serviço: ");
        tempoEmpresaAno = entrada.nextInt();
        
        if (tempoEmpresaAno >= 5){
            valorBonus = salario*0.20;
            System.out.printf("o Valor do bônus é de 20%%, o salario %.2f concede o valor bônus de: %.2f", salario, valorBonus);
        }
        else{
            valorBonus = salario*0.10;
            System.out.printf("o Valor do bônus é de 10%%, o salario %.2f concede o valor bônus de: %.2f", salario, valorBonus);
        }

        entrada.close();
    }
}
