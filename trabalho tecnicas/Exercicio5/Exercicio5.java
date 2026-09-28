package Exercicio5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // ===== CONTA CORRENTE =====

        System.out.println("===== CADASTRO CONTA CORRENTE =====");

        System.out.print("Digite o número da conta: ");
        int numeroCorrente = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite o nome do titular: ");
        String titularCorrente = entrada.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoCorrente = entrada.nextDouble();

        System.out.print("Digite a taxa de manutenção: ");
        double taxaManutencao = entrada.nextDouble();

        ContaCorrente contaCorrente = new ContaCorrente(
                numeroCorrente,
                titularCorrente,
                saldoCorrente,
                taxaManutencao
        );


        // ===== CONTA POUPANÇA =====

        System.out.println();
        System.out.println("===== CADASTRO CONTA POUPANÇA =====");

        System.out.print("Digite o número da conta: ");
        int numeroPoupanca = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite o nome do titular: ");
        String titularPoupanca = entrada.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoPoupanca = entrada.nextDouble();

        System.out.print("Digite o percentual de rendimento: ");
        double percentualRendimento = entrada.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(
                numeroPoupanca,
                titularPoupanca,
                saldoPoupanca,
                percentualRendimento
        );


        // ===== OPERAÇÕES CONTA CORRENTE =====

        System.out.println();
        System.out.println("===== OPERAÇÕES CONTA CORRENTE =====");

        System.out.print("Digite o valor para depositar: ");
        double depositoCorrente = entrada.nextDouble();
        contaCorrente.depositar(depositoCorrente);

        System.out.print("Digite o valor para sacar: ");
        double saqueCorrente = entrada.nextDouble();
        contaCorrente.sacar(saqueCorrente);


        // ===== OPERAÇÕES CONTA POUPANÇA =====

        System.out.println();
        System.out.println("===== OPERAÇÕES CONTA POUPANÇA =====");

        System.out.print("Digite o valor para depositar: ");
        double depositoPoupanca = entrada.nextDouble();
        contaPoupanca.depositar(depositoPoupanca);

        System.out.print("Digite o valor para sacar: ");
        double saquePoupanca = entrada.nextDouble();
        contaPoupanca.sacar(saquePoupanca);


        // ===== RESULTADOS =====

        System.out.println();
        System.out.println("===== CONTA CORRENTE =====");
        contaCorrente.exibirDados();

        System.out.println("===== CONTA POUPANÇA =====");
        contaPoupanca.exibirDados();

        entrada.close();
    }
}