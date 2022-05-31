package classroom;

import java.util.Locale;
import java.util.Scanner;

public class Excercises {
    public static void main(String[] args) {

        // saņem veselu skaili un izvada vai > par 0
/*
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Your number is greater then 0");
        } else {
            System.out.println("Your number is less then 0");
        }

        // pieņem 3 skaitļus un izvada vidējo


        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();

        double midValue = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println(midValue);


        // vismazākais no 3 skaitļiem

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet pirmo skaitli");
        int number1 = scanner.nextInt();
        System.out.println("Ievadiet otro skaitli");
        int number2 = scanner.nextInt();
        System.out.println("Ievadiet trešo skaitli");
        int number3 = scanner.nextInt();
        System.out.println("Mazākais skaitlis ir " + Math.min(Math.min(number1, number2), number3));

        if (number1 < number2 && number1 < number3) {
            System.out.println("Mazākais skaitlis ir " + number1);
        } else if (number2 < number3) {
            System.out.println("Mazākais skaitlis ir " + number2);
            } else {
            System.out.println("Mazākais skaitlis ir " + number3);
            }

        // skaitlis para vai nepara

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Tas ir pāra skaitlis: " + num);
        } else {
            System.out.println("Tas ir nepāra skaitlis: " + num);
        }

        // switch case - 1-5 darba diena, 6-7 brivdiena

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet dienu no 1-7");
        int number = scanner.nextInt();
        switch (number) {
            case 1, 2, 3, 4, 5:
                System.out.println("Darba diena");
                break;
            case 6, 7:
                System.out.println("Brīvdiena");
                break;
            default:
                System.out.println("Text");
        }



        // cipars - mēnesis

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month:");
        String month = scanner.nextLine().toLowerCase();
        // jaNuAry -> january
        switch (month) {
            case "january":
                System.out.printf("January is the %d month", 1);
                break;
            case "february":
                System.out.printf("February is the %d month", 2);
                break;
            default:
                System.out.println("Cannot recognize month:" + month);
        }

        */

        // create calculator with switch case

        Scanner scanner = new Scanner(System.in);
        int a, b;
        String operator;
        System.out.println("Ievadiet pirmo skaitli");
        a = scanner.nextInt();
        System.out.println("Ievadiet operatoru");
        operator = scanner.next();
        System.out.println("Ievadiet otro skaitli");
        b = scanner.nextInt();
        switch (operator) {
            case "+":
                System.out.println("Rezultāts: " + (a + b));
                break;
            case "-":
                System.out.println("Rezultāts: " + (a - b));
                break;
            case "*":
                System.out.println("Rezultāts: " + (a * b));
                break;
            case "/":
                System.out.println("Rezultāts: " + (a + b));
                break;
        }

        }
    }
