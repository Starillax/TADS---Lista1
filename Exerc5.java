import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float fahrenheit, celsius;

        System.out.println("Informe uma temperatura em Fahrenheit:");
        fahrenheit = in.nextFloat();

        celsius = ((fahrenheit - 32) / 9) * 5;

        System.out.println("Essa temperatura, em Celsius, é: " + celsius);
    };
};