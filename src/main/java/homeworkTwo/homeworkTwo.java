package homeworkTwo;

import java.util.Scanner;

public class homeworkTwo {
    public static void main(String[] args) {

        printBusinessCard(); // 5.uzdevums
        printBusinessCard(); // 5.uzdevums
        printBusinessCard(); // 5.uzdevums

        printBusinessCardTwo("Elīna", "Paeglīte", "+371 1234567", 1234); // 6.uzdevums
        printBusinessCardTwo("Vārds", "Uzvārds", "+371 12345678", 4321); // 6.uzdevums

        int summa = sum(8, 9); // 7.uzdevums
        System.out.println(summa); // 7.uzdevums

        System.out.println(average(5, 9, 6)); // 8.uzdevums

        // 1.uzdevums

        int x = 5;
        System.out.println(x > 0);

        x = 2;
        System.out.println(x < 0);

        x = 9;
        boolean result = x > 5 && x <= 10;
        System.out.println(result);

        x = 6;
        result = (!(x <= 5) && x < 10);
        System.out.println(result);

        x = 5;
        result = x == 0 || x == 10;
        System.out.println(result);

        x = 1;
        System.out.println(x * x > 0);

        // 2.uzdevums

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet mēneša skaitli no 1-12");
        String number = scanner.nextLine();
        switch (number) {
            case "1":
                System.out.println("1 ir Janvāris");
                break;
            case "2":
                System.out.println("2 ir Februāris");
                break;
            case "3":
                System.out.println("3 ir Marts");
                break;
            case "4":
                System.out.println("4 ir Aprīlis");
                break;
            case "5":
                System.out.println("5 ir Maijs");
                break;
            case "6":
                System.out.println("6 ir Jūnijs");
                break;
            case "7":
                System.out.println("7 ir Jūlijs");
                break;
            case "8":
                System.out.println("8 ir Augusts");
                break;
            case "9":
                System.out.println("9 ir Septembris");
                break;
            case "10":
                System.out.println("10 ir Oktobris");
                break;
            case "11":
                System.out.println("11 ir Novembris");
                break;
            case "12":
                System.out.println("12 ir Decembris");
                break;
            default:
                System.out.println("Šāda mēneša nav");
        }

        // 3.uzdevums

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ievadiet pirmo skaitli");
        int num1 = scanner.nextInt();
        System.out.println("Ievadiet otro skaitli");
        int num2 = scanner.nextInt();
        System.out.println("Ievadiet trešo skaitli");
        int num3 = scanner.nextInt();
        System.out.println("Lielākais skaitlis ir: " + Math.max(Math.max(num1, num2), num3));

        // 4.uzdevums

        String color = "Zaļš";

        if (color.equals("Sarkans")) {
            System.out.println("Deg sarkanā gaisma, gaidi!");
        } else if (color.equals("Dzeltens")) {
            System.out.println("Deg dzeltenā gaisma, uzgaidi, tūlīt varēsi iet!");
        } else if (color.equals("Zaļš")) {
            System.out.println("Deg zaļā gaisma, ej!");
        } else {
            System.out.println("Nepareiza krāsa!");
        }

    }
        // 5.uzdevums
        public static void printBusinessCard() {
            System.out.println("Vizītkarte");
            System.out.println("##########");
            System.out.println("Vārds: Elīna");
            System.out.println("Uzvārds: Paeglīte");
            System.out.println("Telefons: +371 1234567");
            System.out.println("Dzimšanas gads: 1234");
            System.out.println("##########");

        }

        // 6.uzdevums

        public static void printBusinessCardTwo(String name, String surname, String telephone, int dateOfBirth ) {
            System.out.println("Vizītkarte");
            System.out.println("##########");
            System.out.println("Vārds: " + name);
            System.out.println("Uzvārds: " + surname);
            System.out.println("Telefons: " + telephone);
            System.out.println("Dzimšanas gads: " + dateOfBirth);
            System.out.println("##########");

        }

        // 7.uzdevums

        public static int sum (int x, int y) {
        return x + y;
        }

        // 8.uzdevums

        public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
        }


    }

