package Exercicio4;

public class Exercicio4 {

    public static void main(String[] args) {

        Funcionario funcionario =
                new Funcionario("João", 3000);

        Gerente gerente =
                new Gerente("Carlos", 5000);

        Vendedor vendedor =
                new Vendedor("Maria", 2500, 10000);


        System.out.println("===== FUNCIONÁRIOS =====");

        funcionario.exibirDados();

        gerente.exibirDados();

        vendedor.exibirDados();
    }
}