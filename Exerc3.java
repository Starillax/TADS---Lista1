import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n;

        System.out.println("Informe um número inteiro:");
        n = in.nextInt();

        System.out.println("O quadrado desse número é: " + (n * n));
    };
};