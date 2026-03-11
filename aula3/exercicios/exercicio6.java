import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        // Bruno Geanini dos Reis
        // homens: 72,7kg + 0,75 x(altura - 152, 4 cm)
        // mulheres: 52kg + 0,75 x (altura - 152,4cm)
        Scanner entrada = new Scanner(System.in);

        double altura, peso;
        int sexo;

        System.out.println("Digite a altura em cm: ");
        altura = entrada.nextDouble();

        System.out.printf("Digite o número de acordo com o sexo%n1 - Homem%n2 - Mulher%n");
        sexo = entrada.nextInt();

        if(sexo == 1){
            peso = altura - 152.4;
            peso = peso*0.75 ;
            peso = peso + 72.7;
            System.out.printf("O peso ideal de um homem com %.2f metros de altura é: %.2f", altura, peso);
        }
        else if(sexo == 2){
            peso = altura - 152.4;
            peso = peso*0.75 ;
            peso = peso + 52;
            System.out.printf("O peso ideal de uma mulher com %.2f metros de altura é: %.2f", altura, peso);
        }
        else {
            System.out.println("Valor inválido");
        }

        entrada.close();
    }
}
