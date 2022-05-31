package classroom;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String value;
        value = scanner.nextLine();
        System.out.println("Your name is: " + value);

        /*
        int a, b;
        // - + / *
        char operator;
        System.out.println("Ievadi pirmo skaitli!");
        a = scanner.nextInt();
        System.out.println("Ievadi operatoru");
        operator = scanner.next().charAt(0);
        System.out.println("Ievadi otro skaitli!");
        b = scanner.nextInt();
        // a, b, operator
        if (operator == '+') {
            System.out.println("Result: " + (a + b));
        } else if (operator == '-') {
            System.out.println("Result: " + (a - b));
        } else if (operator == '*') {
            System.out.println("Result: " + (a * b));
        } else if (operator == '/') {
            System.out.println("Result: " + (a / b));
        } else {
            System.out.println("Operator is unknown!");
        }
*/
    }
}
