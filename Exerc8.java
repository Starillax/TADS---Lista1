import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int eleit, valid, branc, nulo;

        System.out.println("Informe os seguintes valores para se calcular o resultado de uma eleição municipal");
        System.out.println("Número total de eleitores:");
        eleit = in.nextInt();
        System.out.println("Número de votos válidos:");
        valid = in.nextInt();
        System.out.println("Número de votos brancos:");
        branc = in.nextInt();
        System.out.println("Número de votos nulos:");
        nulo = in.nextInt();

        float percentValid = (valid * 100) / eleit;
        float percentBranc = (branc * 100) / eleit;
        float percentNulo = (nulo * 100) / eleit;

        System.out.println("Porcentagem de votos válidos: " + percentValid);
        System.out.println("Porcentagem de votos brancos: " + percentBranc);
        System.out.println("Porcentagem de votos nulos: " + percentNulo);
    };
};