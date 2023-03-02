import java.util.Scanner;

public class Exerc9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int c, w, m;

        System.out.println("Informe as quantidades de pessoas presentes no churrasco");
        System.out.println("Número de mulheres:");
        w = in.nextInt();
        System.out.println("Número de homens:");
        m = in.nextInt();
        System.out.println("Número de crianças:");
        c = in.nextInt();

        double total = (c * 200 + w * 320 + m * 400) * 1.2;

        if (total > 1000) {
            String result = (total / 1000) + " Kg";
            System.out.println("Quantidade de carne a ser comprada: " + result);
        } else {
            String result = total + " g";
            System.out.println("Quantidade de carne a ser comprada: " + result);
        };
    };
}
