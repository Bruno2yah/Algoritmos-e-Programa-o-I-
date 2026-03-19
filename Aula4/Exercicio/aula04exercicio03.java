import java.util.Scanner;

public class aula04exercicio03 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char periodo;
        System.out.printf("Qual periodo você estuda:%nM - Matutino%nV - Vespertino%nN - Noturno%n");
        periodo = entrada.next().charAt(0);
        periodo = Character.toUpperCase(periodo);

        switch (periodo) {
            case 'M':
                System.out.println("Bom Dia");
                break;
            case 'V':
                System.out.println("Boa Tarde");
                break;
            case 'N':
                System.out.println("Boa Noite");
                break;
            default:
                System.out.println("Valor invalido");
                break;
            }
            entrada.close();
    }
}
