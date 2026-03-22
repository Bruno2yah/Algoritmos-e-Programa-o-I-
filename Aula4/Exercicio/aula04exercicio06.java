import java.util.Scanner;

public class aula04exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char continuar;
        int codigoProduto, quantidade;
        double valor;
        boolean repetir = true;

        while(repetir){
            System.out.printf("Digite o codigo do produto:%n100 - Cachorro Quente R$ 1,20%n101 - Bauru Simples R$ 1,30%n102 - Bauru com ovo R$ 1,50%n103 - Hamburguer R$ 1,20%n104 - Cheeseburguer R$ 1,30%n105 - Refrigerante R$ 1,00%n");
            codigoProduto = entrada.nextInt();

            System.out.printf("Digite a quantidade:%n");
            quantidade = entrada.nextInt();
    
            switch (codigoProduto) {
                case 100:
                    valor = quantidade * 1.2;
                    System.out.printf("%d Cachorro Quente, valor total: R$ %.2f%n", quantidade, valor);
                    break;
                case 101:
                    valor = quantidade * 1.3;
                    System.out.printf("%d Bauru Simples, valor total: R$ %.2f%n", quantidade, valor);
                    break;
                case 102:
                    valor = quantidade * 1.5;
                    System.out.printf("%d Bauru com ovo, valor total: R$ %.2f%n", quantidade, valor);
                    break;
                case 103:
                    valor = quantidade * 1.2;
                    System.out.printf("%d Hamburguer, valor total: R$ %.2f%n", quantidade, valor);
                    break;
                case 104:
                    valor = quantidade * 1.3;
                    System.out.printf("%d CheeseBurguer, valor total: R$ %.2f%n", quantidade, valor);
                    break;
                case 105:
                    valor = quantidade * 1;
                    System.out.printf("%d Refrigerante, valor total: R$ %.2f%n", quantidade, valor);
                    break;
                default:
                    System.out.println("Produto não existe");
                    break;
                }
            
            System.out.println("Deseja continuar? s/n");
            continuar = entrada.next().charAt(0);
            continuar = Character.toUpperCase(continuar);

            if(continuar != 'S'){
                repetir = false;
                System.out.println("Programa encerrado");
            }
        }
            entrada.close();
    }
}
