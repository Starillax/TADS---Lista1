import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int valIngresso, socios, child, other;

        System.out.println("Valor completo do ingresso:");
        valIngresso = in.nextInt();
        System.out.println("Quantidade de sócios do clube:");
        socios = in.nextInt();
        System.out.println("Quantidade de crianças menores de 10 anos:");
        child = in.nextInt();
        System.out.println("Pessoas restantes:");
        other = in.nextInt();

        int publico = socios + child + other;
        double receita = (valIngresso * other) + ((valIngresso * socios) * 0.7);
        double desconto = (valIngresso * child) + ((valIngresso * socios) * 0.3);

        System.out.println("Público do evento: " + publico + " pessoas");
        System.out.println("Arredação total: R$ " + receita);
        System.out.println("Valor descontado da arrecadação: R$ " + desconto);
    };
}
