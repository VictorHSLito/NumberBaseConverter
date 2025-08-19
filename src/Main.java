import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Converse Calculator!");
        System.out.println("Here the menu: ");

        System.out.println("1 - Convert decimal to binary");
        System.out.println("2 - Convert octal to binary");
        System.out.println("3 - Convert hex to binary");

        System.out.print("Your choice: ");

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        Choices choices = Choices.fromValue(input);

        BinaryCalculator calculator = new BinaryCalculator();

        int number;
        String answer = "";

        switch (choices) {

            case FROM_DECIMAL_TO_BINARY:
                System.out.println("\n--- FROM DECIMAL TO BINARY ---");
                System.out.println("An decimal number is a number that goes from 0 to 9");
                System.out.println("An example of an decimal number, ex: 21042819");
                System.out.println("Now type an octal number and discover this number in binary: ");
                number = sc.nextInt();
                answer = calculator.fromDecimal(number);
                System.out.printf("You typed %d%n", number);
                System.out.printf("This number in binary is: %s", answer);
                break;

            case FROM_OCTAL_TO_BINARY:
                System.out.println("\n--- FROM OCTAL TO BINARY ---");
                System.out.println("An octal number is a number that goes from 0 to 7");
                System.out.println("An example of an octal number, ex: 4272400");
                System.out.println();
                System.out.println("Now type an octal number and discover this number in binary: ");
                number = sc.nextInt();
                answer = calculator.fromOctal(number);
                System.out.printf("You typed %d%n", number);
                System.out.printf("This number in binary is: %s", answer);
                break;

            case FROM_HEX_TO_BINARY:
                System.out.println("\n--- FROM HEX TO BINARY ---");
                System.out.println("A hex number is a number that goes from 0 to 9 and A to F");
                System.out.println("A is equivalent to 10, B to 11, C to 12 and so on...");
                System.out.println("An example of a hex number, ex: 9D3CFA0");
                System.out.println();
                System.out.println("Now type a hex number and discover this number in binary: ");
                String hexNumber = sc.next();
                answer = calculator.fromHex(hexNumber);
                System.out.printf("You typed %s%n", hexNumber);
                System.out.printf("This number in binary is: %s", answer);
                break;
        }
    }
}