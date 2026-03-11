import java.util.Scanner;
public class aula2exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero, resultado = 0;
        
        for(int i = 1; i <=4; i++){
            System.out.printf("Digite o %d° numero inteiro: %n", i);
            numero = ler.nextInt();
            resultado += numero;
        }

        System.out.printf("a soma dos 4 valores é: %d", resultado);

        ler.close();
    }
}
