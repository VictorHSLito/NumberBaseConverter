import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");

        long number = sc.nextLong();

        BinaryCalculator calculator = new BinaryCalculator();
        String answer = calculator.fromOctal((int) number);

        System.out.printf("Número digitado em octal: %s%n", number);
        System.out.printf("Valor em binário: %s%n", answer);
    }
}