package Exercicio3 ;


public class exercicio3 {


    public static void main(String[] args) {

        funcionario funcionario1 =
                new funcionario("João", "Programador", 3000);

        funcionario funcionario2 =
                new funcionario("Maria", "Analista", 3500);

        funcionario funcionario3 =
                new funcionario("Carlos", "Gerente", 5000);

        funcionario funcionario4 =
                new funcionario("Ana", "Designer", 2800);

        funcionario funcionario5 =
                new funcionario("Pedro", "Suporte", 2500);


        funcionario1.aumentarSalario(10);
        funcionario2.aumentarSalario(5);
        funcionario3.aumentarSalario(15);
        funcionario4.aumentarSalario(8);
        funcionario5.aumentarSalario(12);


        System.out.println("===== FUNCIONÁRIOS =====");

        funcionario1.exibirDados();
        funcionario2.exibirDados();
        funcionario3.exibirDados();
        funcionario4.exibirDados();
        funcionario5.exibirDados();
    }
}



