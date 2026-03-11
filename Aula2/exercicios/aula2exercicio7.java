import java.lang.Math;
public class aula2exercicio7{
    public static void main(String[] args) {
        double resultado, calculo;

        // (20 - 15)/2.0
        resultado = (20 - 15)/2.0;
        System.out.printf("O resultado de (20 - 15)/2 é: %.2f%n", resultado);
        
        // 2 ˆ (5/20) + 30 / (15 ˆ 2)
        resultado = Math.pow(2, 5/20.0);
        calculo = 15*15.0;
        calculo = 30/calculo;
        resultado += calculo;

        System.out.printf("O resultado de 2 ^ (5/20) + 30 / (15 ^ 2) é: %.2f%n", resultado);

        // 35 / (6 + 2)
        resultado = 35.0 / (6+2);
        System.out.printf("O resultado de 35 / (6 + 2) é: %.2f%n", resultado);

        // 23 módulo 4 
        resultado = 23%4.0;
        System.out.printf("O resultado de 23 módulo 4 é: %.2f%n", resultado);
    }
}