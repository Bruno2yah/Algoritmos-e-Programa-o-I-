import java.lang.Math;
public class aula2exercicio8{
    public static void main(String[] args) {
        
            double resultado1, resultado2;
            boolean conclusaoFinal, conclusao1, conclusao2;

            // ((120 - 30) = (3 ˆ 30))
            resultado1 = 120-30;
            resultado2 = Math.pow(3, 30);

            conclusaoFinal = resultado1 == resultado2;

            System.out.println("a expressão ((120 - 30) = (3 ^ 30)) é: " + conclusaoFinal);

            // (não ((20 módulo 4)/2 = 1) ou (9 != 9))

            conclusao1 = (20%4)/2 == 1;

            conclusao2 = 9 != 9;

            conclusaoFinal = !conclusao1 || conclusao2;

            System.out.println("a expressão (não ((20 módulo 4)/2 = 1) ou (9 != 9)) é: " + conclusaoFinal);

            // ((5 módulo 2 ) > 3)

            conclusaoFinal = 5%2 > 3;
            System.out.println("a expressão ((5 módulo 2 ) > 3) é: " + conclusaoFinal);

            // (a = A)
            conclusaoFinal = "a" == "A";
            System.out.println("A expressão a = A é: " + conclusaoFinal);

    }
};