package git.leandrosouzasnts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var n1 = 0;
        var n2 = 0;

        System.out.println("Bem vindo ao ContadorApp");

        System.out.println("Informe o primeiro valor: ");
        n1 = scanner.nextInt();

        System.out.println("Informe o segundo valor: ");
        n2 = scanner.nextInt();

        try {
           Contador.contar(n1,n2);
        } catch (ParametrosInvalidosException ex) {
            System.out.println(ex.getMessage());
        }
        scanner.close();
    }
}