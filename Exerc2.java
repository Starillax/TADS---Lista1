import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float n;

        System.out.println("Informe um número real:");
        n = in.nextFloat();
        n += n * 0.2;

        System.out.println("120% desse número é: " + n);
    };
};