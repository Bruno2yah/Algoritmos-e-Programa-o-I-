package Aula6.exercicios;
import java.util.Scanner;
public class aula06exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade, contadorMedia = 0;
        double altura, media = 0;

        for(int i = 1; i <= 10; i++){
            System.out.println("Digite a idade: ");
            idade = entrada.nextInt();

            System.out.println("Digite a altura: ");
            altura = entrada.nextDouble();

            if(idade>50){
                contadorMedia++;
                media += altura;
            }
        }
        if(media > 0){
            media = media/contadorMedia;
            System.out.printf("A média das pessoas com mais de 50 anos é: %.2f", media);
        } else {
            System.out.println("Não tem pessoas com mais de 50 anos");
        }

        entrada.close();
    }
}
