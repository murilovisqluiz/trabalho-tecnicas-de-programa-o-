package Exercicio1 ;


import java.util.Scanner;


public class exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do saque: ");
        int valor = scanner.nextInt();

        int[] notas = {200, 100, 50, 20, 10, 5, 2};

        System.out.println("\nNotas:");

        for (int nota : notas) {

            int quantidade = valor / nota;

            if (quantidade > 0) {
                System.out.println(quantidade + " x R$ " + nota);
                valor = valor % nota;
            }
        }

        scanner.close();
    }
}
