package Exercicio3 ;

public class funcionario {

    private String nome;
    private String cargo;
    private double salario;
    private double percentualAumento;

    public funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        percentualAumento = percentual;
        salario = salario + (salario * percentual / 100);
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.printf("Aumento: %.0f%%%n", percentualAumento);
        System.out.printf("Salário anual: R$ %.2f%n", calcularSalarioAnual());
        System.out.println("-------------------------");
    }
}