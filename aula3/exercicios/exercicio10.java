import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        // Bruno Geanini dos Reis
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, numero3, maiorNumero;

        System.out.println("Digite o primeiro número inteiro: ");
        numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        numero2 = entrada.nextInt();
        System.out.println("Digite o terceiro número inteiro: ");
        numero3 = entrada.nextInt();

        if(numero1 == numero2 && numero2 == numero3){
            System.out.println("Os números são iguais");
        }
        else if(numero1 >= numero2 && numero1 >= numero3){
            maiorNumero = numero1;
            System.out.println(maiorNumero);
        } 
        else if(numero2 >= numero1 && numero2 >= numero3){
            maiorNumero = numero2;
            System.out.println(maiorNumero);
        } 
        else{
            maiorNumero = numero3;
            System.out.println("O maior número é: " + maiorNumero);
        }
        entrada.close();
    }   
}
