import java.util.Scanner;
public class aula2exercicio6{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double nota, soma = 0, media;

        for(int i = 1; i<=3; i++){
            System.out.printf("Digite a %d° nota do aluno: %n", i);
            nota = ler.nextDouble();
            soma += nota;
        }

        media = soma/3;

        System.out.printf("A média das notas é: %.2f", media);

        ler.close();
    }
}
