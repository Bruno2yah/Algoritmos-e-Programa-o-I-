import java.util.Scanner;
public class aula2exercicio4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero1, numero2, produto;
        
        System.out.println("Digite o primeiro valor: ");
        numero1 = ler.nextInt();
        System.out.println("Digite o segundo valor: ");
        numero2 = ler.nextInt();

        produto = numero1 * numero2;

        System.out.printf("o produto entre o numero %d e %d é: %d", numero1, numero2, produto);

        ler.close();
    }

}
