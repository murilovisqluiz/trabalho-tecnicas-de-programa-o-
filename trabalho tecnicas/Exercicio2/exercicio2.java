package Exercicio2 ;

import java.util.Scanner;



public class exercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de vendas: ");
        int quantidadeVendas = scanner.nextInt();

        double totalVendido = 0;
        double maiorVenda = 0;
        double menorVenda = 0;
        int vendasAcima500 = 0;

        for (int i = 1; i <= quantidadeVendas; i++) {

            System.out.print("Digite o valor da venda " + i + ": R$ ");
            double venda = scanner.nextDouble();

            totalVendido += venda;

            if (i == 1) {
                maiorVenda = venda;
                menorVenda = venda;
            } else {

                if (venda > maiorVenda) {
                    maiorVenda = venda;
                }

                if (venda < menorVenda) {
                    menorVenda = venda;
                }
            }

            if (venda > 500) {
                vendasAcima500++;
            }
        }

        double media = totalVendido / quantidadeVendas;

        double percentualComissao;

        if (totalVendido <= 1000) {
            percentualComissao = 0.03;
        } else if (totalVendido <= 5000) {
            percentualComissao = 0.05;
        } else {
            percentualComissao = 0.08;
        }

        double comissao = totalVendido * percentualComissao;

        System.out.println("\n===== RESULTADO =====");
        System.out.printf("Total vendido: R$ %.2f%n", totalVendido);
        System.out.printf("Maior venda: R$ %.2f%n", maiorVenda);
        System.out.printf("Menor venda: R$ %.2f%n", menorVenda);
        System.out.printf("Média das vendas: R$ %.2f%n", media);
        System.out.println("Vendas acima de R$ 500: " + vendasAcima500);
        System.out.printf("Comissão: R$ %.2f%n", comissao);

        scanner.close();
    }
}

