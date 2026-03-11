import java.util.Scanner;
public class aula2exercicio12 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        int anoNascimento, anoAtual, idadeAtual, idade2030; 

        System.out.println("Digite o ano de nascimento");
        anoNascimento = ler.nextInt();

        System.out.println("Digite o ano atual");
        anoAtual = ler.nextInt();

        
        idadeAtual = anoAtual - anoNascimento;

        idade2030 = 2030 - anoNascimento;

        System.out.println("A Idade atual é: " + idadeAtual);
        System.out.println("A idade em 2030 será: " + idade2030);

        ler.close();
    }
}
