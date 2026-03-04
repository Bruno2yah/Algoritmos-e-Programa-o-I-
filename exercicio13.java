import java.util.Scanner;
import java.lang.Math;
public class exercicio13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double numero;

        System.out.println("Digite o número: ");
        numero = ler.nextDouble();

        System.out.println("O número elevado ao quadrado: " + Math.pow(numero, 2));
        System.out.println("O número elevado ao cubo: " + Math.pow(numero, 3));
        System.out.println("O número elevado ao quadrado: " + Math.sqrt(numero));
        System.out.println("O número elevado a potência de 10: " + Math.pow(numero, 10));

        ler.close();
    }
}
