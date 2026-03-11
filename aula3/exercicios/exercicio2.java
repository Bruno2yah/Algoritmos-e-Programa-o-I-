import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        // Bruno Geanini dos Reis
        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.println("Digite a idade: ");
        idade = entrada.nextInt();

        if(idade >= 18){
            System.out.println("Maior de idade");
        }
        else {
            System.out.println("Menor de idade");
        }
        entrada.close();
    }
}
