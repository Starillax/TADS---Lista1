import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float nota1, nota2, media;

        System.out.println("Informe as notas de duas avaliações:");
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();

        media = (nota1 + nota2) / 2;

        System.out.println("A média dessas notas é: " + media);
    };
};