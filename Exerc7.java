import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float dist, vel, temp;

        System.out.println("Informe os seguintes valores para se calcular o tempo de viagem");
        System.out.println("Distância do trajeto, em km:");
        dist = in.nextFloat();
        System.out.println("Velocidade média, em km/h:");
        vel = in.nextFloat();

        temp = dist / vel;

        System.out.println("O tempo será, aproxidamente, de: " + temp + " horas");
    };
};