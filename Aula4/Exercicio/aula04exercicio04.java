import java.util.Scanner;

public class aula04exercicio04 {
      // Bruno Geanini dos Reis
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char plano, continuar;
        double salario;
        boolean repetir = true;

        while(repetir){
            System.out.printf("Digite o plano de trabalho:%nA - 10%%%nB - 15%%%nC - 20%%%n");
            plano = entrada.next().charAt(0);
            plano = Character.toUpperCase(plano);

            System.out.printf("Digite o salário:");
            salario = entrada.nextDouble();
    
            switch (plano) {
                case 'A':
                    salario = salario * 1.10;
                    System.out.printf("O salário terá aumento de 10%% e valor será: %.2f%n", salario);
                    break;
                case 'B':
                    salario = salario * 1.15;
                    System.out.printf("O salário terá aumento de 15%% e valor será: %.2f%n", salario);
                    break;
                case 'C':
                    salario = salario * 1.20;
                    System.out.printf("O salário terá aumento de 20%% e valor será: %.2f%n", salario);
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
