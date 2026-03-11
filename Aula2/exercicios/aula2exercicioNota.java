import java.util.Scanner;
public class aula2exercicioNota {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome;
        double nota1, nota2, media;


        System.out.println("Digite o nome: ");
        nome = ler.nextLine();
        System.out.println("Digite o valor da primeira nota: ");
        nota1 = ler.nextDouble();
        System.out.println("Digite o valor da segunda nota: ");
        nota2 = ler.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.printf("A media das notas de %s é: %.2f", nome, media);

        ler.close();
    }
}
