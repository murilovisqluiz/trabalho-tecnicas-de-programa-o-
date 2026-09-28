package Exercicio5;

public class ContaPoupanca extends Conta {

    private double percentualRendimento;

    public ContaPoupanca(
            int numero,
            String titular,
            double saldo,
            double percentualRendimento) {

        super(numero, titular, saldo);

        this.percentualRendimento = percentualRendimento;
    }

    @Override
    public double calcularSaldo() {
        return saldo + (saldo * percentualRendimento / 100);
    }
}