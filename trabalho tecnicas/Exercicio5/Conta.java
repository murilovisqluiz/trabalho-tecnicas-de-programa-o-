package Exercicio5;

public class Conta {

    protected int numero;
    protected String titular;
    protected double saldo;

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public double calcularSaldo() {
        return saldo;
    }

    public void exibirDados() {
        System.out.println("Número: " + numero);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f%n", calcularSaldo());
        System.out.println("-------------------------");
    }
}