package Aula6.exercicios;
import java.util.Scanner;
public class aula06exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int aprovados = 0, exame = 0, reprovados = 0;
        double nota1, nota2, mediaAluno = 0, mediaAlunos = 0;
        boolean repetirNota;

        for(int i = 1; i<=6; i++){
            do {
                System.out.println("Digite a primeira nota do " + i + "° aluno");
                nota1 = entrada.nextDouble();
                if(nota1 < 0 || nota1 > 10){
                    repetirNota = true;
                    System.out.println("Valor inválido! Digite um valor entre 0 e 10");
                } else{
                    repetirNota = false;
                }
            } while(repetirNota);
            do {
                System.out.println("Digite a segunda nota do " + i + "° aluno");
                nota2 = entrada.nextDouble();
                if(nota2 < 0 || nota2 > 10){
                    repetirNota = true;
                    System.out.println("Valor inválido! Digite um valor entre 0 e 10");
                } else{
                    repetirNota = false;
                }
            } while(repetirNota);

            mediaAluno = (nota1 + nota2)/2.0;

            mediaAlunos += mediaAluno;

            if(mediaAluno <= 3){
                System.out.printf("A média do %d° aluno é: %.2f - REPROVADO%n", i, mediaAluno );
                reprovados++;
            } else if(mediaAluno<=7){
                System.out.printf("A média do %d° aluno é: %.2f - EXAME%n", i, mediaAluno );
                exame++;
            } else {
                System.out.printf("A média do %d° aluno é: %.2f - APROVADO%n", i, mediaAluno );
                aprovados++;
            }
        }

        mediaAlunos = mediaAlunos/6;
        System.out.printf("O total de alunos aprovados é: %d%nO total de alunos de exame é: %d%nO total de alunos reprovados é: %d%nA média da classe é: %.2f", aprovados, exame, reprovados, mediaAlunos);

        entrada.close();
    }
}
