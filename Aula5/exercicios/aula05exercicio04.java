package Aula5.exercicios;

public class aula05exercicio04 {
    public static void main(String[] args) {
        int i = 10;
        double metade;

        while(i <= 20){
            metade = i/2.0;
            System.out.printf("A metade de %d é %.2f%n", i, metade);
            i++;
        }
    }
}
