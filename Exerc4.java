import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float base, altura, area;

        System.out.println("Informe as dimensões de um triângulo");
        System.out.println("Base:");
        base = in.nextFloat();
        System.out.println("Altura:");
        altura = in.nextFloat();

        area = (base * altura) / 2;

        System.out.println("O valor da área do triângulo é: " + area);
    };
};