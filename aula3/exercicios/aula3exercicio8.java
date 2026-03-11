import java.util.Scanner;
public class aula3exercicio8 {
    public static void main(String[] args) {
        // Bruno Geanini dos Reis
        Scanner entrada = new Scanner(System.in);
        
        String senha, senhaCorreta = "R10p5";

        System.out.println("Digite a senha: ");
        senha = entrada.nextLine();

        if(senha.equals(senhaCorreta)){
            System.out.println("Acesso concedido");
        }
        else{
            System.out.println("Acesso negado");
        }
        entrada.close();
    }
}
