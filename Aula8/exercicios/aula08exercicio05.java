package exercicios;

import java.util.Scanner;

public class aula08exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        char continuar;

        while(true){
            System.out.println("Digite o número da semana: ");
            numero = entrada.nextInt();
            entrada.nextLine();

            System.out.println(exibirDiaSemana(numero));

            System.out.println("Digite S/s para sair (digite qualquer outra tecla para continuar)");
            continuar = entrada.next().charAt(0);
            
            if(continuar == 's' || continuar == 'S'){
                    break;
            }
        }

        entrada.close();
    }
    public static String exibirDiaSemana(int n){
        String diaSemana;
        switch (n) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda";
                break;
            case 3:
                diaSemana = "Terça";
                break;
            case 4:
                diaSemana = "Quarta";
                break;
            case 5:
                diaSemana = "Quinta";
                break;
            case 6:
                diaSemana = "Sexta";
                break;
            case 7:
                diaSemana = "Sabado";
                break;
            default:
                diaSemana = "Dia da semana inválido.";
                break;
        }
        return diaSemana;
    }
}
