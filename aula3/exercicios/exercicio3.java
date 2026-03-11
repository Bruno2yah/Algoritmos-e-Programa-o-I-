import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        // Bruno Geanini dos Reis
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, diferenca;

        System.out.println("informe o primeiro valor: ");
        numero1 = entrada.nextInt();
        System.out.println("informe o segundo valor: ");
        numero2 = entrada.nextInt();

        if (numero1 == numero2){
            System.out.println("Numeros iguais");
        }
        else {
            diferenca = numero1 - numero2;
            if(diferenca<0){
                diferenca = diferenca*-1;
            }
            System.out.printf("A diferença entre o %d e %d é de: %d", numero1, numero2, diferenca);
        }

        entrada.close();
    }
}
