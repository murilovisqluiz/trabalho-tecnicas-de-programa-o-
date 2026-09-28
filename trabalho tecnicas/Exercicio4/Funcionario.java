package Exercicio4;

public class Funcionario {

    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.printf("Salário final: R$ %.2f%n", calcularSalario());
        System.out.println("-------------------------");
    }
}