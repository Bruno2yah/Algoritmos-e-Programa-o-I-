package Aula5.exercicios;

import java.util.Scanner;

public class aula05exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char continuar;
        int codigoProduto, quantidade, quantidadeCachorroQuente = 0, quantidadeBauruSimples = 0, quantidadeBauruOvo = 0, quantidadeHamburguer = 0, quantidadeCheeseburguer = 0, quantidadeRefrigerante = 0;
        double valorTotal = 0, valorCachorroQuente = 0, valorBauruSimples = 0, valorBauruOvo = 0, valorHamburguer = 0, valorCheeseburguer = 0, valorRefrigerante = 0;
        boolean repetir = true;
        String legendaCompraFinal = "", valorFormatado;

        while(repetir){
            System.out.printf("Digite o codigo do produto:%n100 - Cachorro Quente R$ 1,20%n101 - Bauru Simples R$ 1,30%n102 - Bauru com ovo R$ 1,50%n103 - Hambúrguer R$ 1,20%n104 - Cheeseburguer R$ 1,30%n105 - Refrigerante R$ 1,00%n");
            codigoProduto = entrada.nextInt();

            System.out.printf("Digite a quantidade:%n");
            quantidade = entrada.nextInt();
    
            switch (codigoProduto) {
                case 100:
                    if(valorCachorroQuente == 0) {
                        valorCachorroQuente = quantidade * 1.2;
                    } else {
                        valorCachorroQuente += quantidade * 1.2;
                    }
                    quantidadeCachorroQuente += quantidade;
                    break;
                case 101:
                    if(valorBauruSimples == 0) {
                        valorBauruSimples = quantidade * 1.30;
                    } else {
                        valorBauruSimples += quantidade * 1.30;
                    }
                    quantidadeBauruSimples += quantidade;
                    break;
                case 102:
                    if(valorBauruOvo == 0) {
                        valorBauruOvo = quantidade * 1.50;
                    } else {
                        valorBauruOvo += quantidade * 1.50;
                    }
                    quantidadeBauruOvo += quantidade;
                    break;
                case 103:
                    if(valorHamburguer == 0) {
                        valorHamburguer = quantidade * 1.20;
                    } else {
                        valorHamburguer += quantidade * 1.20;
                    }
                    quantidadeHamburguer += quantidade;
                    break;
                case 104:
                    if(valorCheeseburguer == 0) {
                        valorCheeseburguer = quantidade * 1.30;
                    } else {
                        valorCheeseburguer += quantidade * 1.30;
                    }
                    quantidadeCheeseburguer += quantidade;
                    break;
                case 105:
                    if(valorRefrigerante == 0) {
                        valorRefrigerante = quantidade * 1;
                    } else {
                        valorRefrigerante += quantidade * 1;
                    }
                    quantidadeRefrigerante += quantidade;
                    break;
                default:
                    System.out.println("Produto não existe");
                    break;
                }
        
            System.out.println("Deseja comprar mais produtos? s/n");
            continuar = entrada.next().charAt(0);
            continuar = Character.toUpperCase(continuar);

            if(continuar != 'S'){
                repetir = false;
                System.out.println("Compra finalizada");
            }
        }
        
        if(quantidadeCachorroQuente > 0){
            valorTotal += valorCachorroQuente;
            valorFormatado = String.format("%.2f", valorCachorroQuente);
            legendaCompraFinal += "Cachorro Quente " + quantidadeCachorroQuente + " unidade(s). Valor: R$ " + valorFormatado + "%n";
        }
        if(quantidadeBauruSimples > 0){
            valorTotal += valorBauruSimples;
            valorFormatado = String.format("%.2f", valorBauruSimples);
            legendaCompraFinal += "Bauru simples " + quantidadeBauruSimples + " unidade(s). Valor: R$ " + valorFormatado + "%n";
        }
        if(quantidadeBauruOvo > 0){
            valorTotal += valorBauruOvo;
            valorFormatado = String.format("%.2f", valorBauruOvo);
            legendaCompraFinal += "Bauru com ovo " + quantidadeBauruOvo + " unidade(s). Valor: R$ " + valorFormatado + "%n";
        }
        if(quantidadeHamburguer > 0){
            valorTotal += valorHamburguer;
             valorFormatado = String.format("%.2f", valorHamburguer);
            legendaCompraFinal += "Hambúrguer " + quantidadeHamburguer + " unidade(s). Valor: R$ " + valorFormatado + "%n";
        }
        if(quantidadeCheeseburguer > 0){
            valorTotal += valorCheeseburguer;
            valorFormatado = String.format("%.2f", valorCheeseburguer);
            legendaCompraFinal += "Cheeseburguer " + quantidadeCheeseburguer + " unidade(s). Valor: R$ " + valorFormatado + "%n";
        }
        if(quantidadeRefrigerante > 0){
            valorTotal += valorRefrigerante;
            valorFormatado = String.format("%.2f", valorRefrigerante);
            legendaCompraFinal += "Refrigerante " + quantidadeRefrigerante + " unidade(s). Valor: R$ " + valorFormatado + "%n";
        }
        System.out.printf(legendaCompraFinal);
        System.out.printf("Valor total: R$ %.2f", valorTotal);
        entrada.close();
    }
}
