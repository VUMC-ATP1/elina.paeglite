package classroom;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        String myName = "Elīna";
        int myAge = 31;
        printMyNameAndAge(myName, myAge);
        printMyNameAndAge("Elīna", 31);

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi savu vecumu");
        checkMyAge(scanner.nextInt());
*/
        System.out.println(sumOfNumbers(5, 9, 15));
        int summa = sumOfNumbers(5, 9, 15);
        System.out.println(summa);

        System.out.println(isAdult(20));
    }

    public static void printMyNameAndAge(String name, int age) {
        System.out.printf("Your name is %s. And your age is %d", name, age);
    }

    //check age,
    //int age,
    // if age < 0 - are you alive?
    // if age >= 14 <= 16 - Hektors pavisam drīz
    // age = 17 - pienemu, ka aug bārda
    // age => skrien uz veikalu līdz 22:00

    public static void checkMyAge(int age) {
        if (age >= 14 && age <= 16) {
            System.out.println("Pagaidi");
        } else if (age == 17) {
            System.out.println("Bārda");
        } else if (age >= 18) {
            System.out.println("Skrien");
        } else if (age == 0) {
            System.out.println("Nepareizs vecums");
        } else {
            System.out.println("Are you alive?");
        }
    }

    public static int sumOfNumbers(int x, int y, int z) {
        return x + y + z;
    }

    public static boolean isAdult(int age) {
        boolean isAdult = false;
        if (age >= 18) {
            isAdult = true;
        }
        return isAdult;
    }

    // create methods for calculator
    public static int plus (int num1, int num2) {
        return num1+num2;
    }
    public static int minus (int num1, int num2) {
        return num1-num2;
    }
    public static int reizinat (int num1, int num2) {
        return num1*num2;
    }
    public static int dalit (int num1, int num2) {
        return num1/num2;
    }

    public static int calculator(int num1, int num2, String operator) {
        switch (operator) {
            case "+":
                return plus(num1, num2);
            case "-":
                return minus(num1, num2);
            case "*":
                return reizinat(num1, num2);
            case "/":
                return dalit(num1, num2);
            default:
                return 0;
        }
    }
}


