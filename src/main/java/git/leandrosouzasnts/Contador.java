package git.leandrosouzasnts;

public class Contador {

    public static void contar(Integer n1, Integer n2){
        if (n1 > n2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int i = 1; i <= n2; i++) {
            System.out.println("Imprindo o número " + i);
        }
    }
}
