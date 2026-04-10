package Aula6.exercicios;
import java.util.Scanner;;
public class aula06exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int voto, candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, nulo = 0, branco = 0;
        double percentualNuloBranco;
        boolean repetir;

        for(int i=1; i<=10; i++){
            do{
                System.out.println("Digite o voto: ");
                voto = entrada.nextInt();

                if(voto<1 || voto>6){
                    repetir = true;
                    System.out.println("Por favor digite um valor valido (1-6)");
                } else{
                    repetir = false;
                }
            }while(repetir);

            if(voto == 1){
                candidato1++;
            } else if(voto == 2){
                candidato2++;
            } else if(voto == 3){
                candidato3++;
            } else if(voto == 4){
                candidato4++;
            } else if(voto == 5){
                nulo++;
            } else if(voto == 6){
                branco++;
            }
        }
        percentualNuloBranco = (nulo + branco)/10.0;
        percentualNuloBranco = percentualNuloBranco*100;

        System.out.printf("O total de votos para o candidato 1 é: %d%nO total de votos para o candidato 2 é: %d%nO total de votos para o candidato 3 é: %d%nO total de votos para o candidato 4 é: %d%nO total de votos nulos é: %d%nO total de votos em branco é: %d%nO percentual de votos brancos e nulos é: %.2f%%", candidato1, candidato2, candidato3, candidato4, nulo, branco, percentualNuloBranco);
        entrada.close();
    }
}
