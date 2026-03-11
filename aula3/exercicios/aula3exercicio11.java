import java.util.Scanner;
public class aula3exercicio11 {
    public static void main(String[] args) {
        // Bruno Geanini dos Reis
        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.println("Digite a idade do nadador: ");
        idade = entrada.nextInt();

        if(idade<5){
            System.out.println("não existe categoria para essa idade");
        }
        else if(idade<=7){
            System.out.println("A categoria do nadador é Infantil A");
        }
        else if(idade<=10){
            System.out.println("A categoria do nadador é Infantil B");
        }
        else if(idade<=13){
            System.out.println("A categoria do nadador é Juvenil A");
        }
        else if(idade<=17){
            System.out.println("A categoria do nadador é Juvenil B");
        }
        else{
            System.out.println("A categoria do nadador é Sênior");
        }

        entrada.close();
    }
}
