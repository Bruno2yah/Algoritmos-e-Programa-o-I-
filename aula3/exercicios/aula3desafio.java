import java.util.Scanner;
public class aula3desafio {
    // Bruno Geanini dos Reis
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade, brasileiro, tituloEleitor, normalizacao;

        System.out.println("você tem qual idade? ");
        idade = entrada.nextInt();

        if(idade < 16){
            System.out.println("Lamento por isso, mas você não está apto a votar, pois é necessário ter no minimo 16 anos");
        } else {
            System.out.printf("Você é brasileiro?%n1 - Sim%n2 - Não%n");
            brasileiro = entrada.nextInt();

            if(brasileiro == 1){
                System.out.printf("você tem titulo de eleitor?%n1 - Sim%n2 - Não%n");
                tituloEleitor = entrada.nextInt();
                if(tituloEleitor == 1){
                    System.out.printf("A sua situação eleitoral está normalizada?%n1 - Sim%n2 - Não%n");
                    normalizacao = entrada.nextInt();
                    if (normalizacao == 1){
                        System.out.println("você está apto a votar.");
                    } else if(normalizacao == 2){
                        System.out.println("Lamento por isso, mas você não está apto a votar, pois é necessário ter a situação eleitoral regular");
                    } else {
                        System.out.println("Valor inválido");
                    }
                } else if(tituloEleitor == 2){
                    System.out.println("Lamento por isso, mas você não está apto a votar, pois é necessário ter titulo de eleitor");
                } else{
                    System.out.println("Valor inválido");
                }
            } else if(brasileiro == 2){
                System.out.println("Lamento por isso, mas você não está apto a votar, pois é necessário ter nacionalidade brasileira");
            } else {
                System.out.println("Valor inválido");
            }
        }
        
        entrada.close();
    }
}
