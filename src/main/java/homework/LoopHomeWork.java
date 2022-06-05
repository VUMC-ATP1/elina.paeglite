package homework;

import java.util.Random;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

        // 1.uzdevums - nesaprotu, kāpēc pēc robežas 100 sasniegšanas, tiek prasīts ievadīt vēl vienu skaitli un tikai tad programma apstājas.

        int sum = 0;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ievadiet veselu skaitli");
        int answer = scanner1.nextInt();
        while (sum < 100) {
            sum += answer;
            System.out.println("Ievadiet jaunu skaitli");
            answer = scanner1.nextInt();
        }
        System.out.println("Gatavs!");

        // 2.uzdevums - šeit šķiet, ka viss ir ok

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet veselu skaitli");
        int a = scanner.nextInt();
        int i = 2;
        boolean prime = false;
        while (i <= a / 2) {
            if (a % i == 0) {
                prime = true;
                break;
            }
            i++;
        }
        if (!prime)
            System.out.println("Tas ir pirmskaitlis: " + a);
        else
            System.out.println("Tas nav pirmskaitlis: " + a);

        // 3.uzdevums - te lielākā daļa ir galīgi garām :)

        int[] dienas = new int[30];
        int num = 0;
        while (num < dienas.length) {
            System.out.printf(num + " ");
            num++;
            System.out.println();
        }

        num = 0;
        do {
            System.out.printf(num + " ");
            num++;
        } while (num < 30);
        System.out.println();


        for (int j = 0; j < dienas.length; j++) {
            int diena = dienas[j];
            System.out.println(diena);
        }

        for (int diena : dienas) {
            System.out.println(diena);
        }

        String[] darbadienas = new String[]{"Pirmdiena", "Otrdiena", "Trešdiena", "Ceturtdiena", "Piektdiena"};

        i = 0;
        while (i < darbadienas.length) {
            System.out.printf(i + " ");
            i++;
            System.out.println();
        }

        i = 0;
        do {
            System.out.printf(i + " ");
            i++;
        } while (i < 4);
        System.out.println();

        i = 0;
        do {
            if (darbadienas[i].equals("Pirmdiena")) {
                System.out.println("Pirmā darba diena");
            } else if (darbadienas[i].equals("Otrdiena")) {
                System.out.println("Otrā darba diena");
            } else {
                System.out.println(darbadienas[i]);
            }
            i++;
        } while (i < darbadienas.length);

        for (int j = 0; j < darbadienas.length; j++) {

        }
        for (String darbadiena : darbadienas) {
            if (darbadienas.equals("Pirmdiena")) {
                System.out.println("Pirmā darba diena");
            } else {
                System.out.println(darbadienas);
            }
        }

        // 4.uzdevums - šķiet, ka viss ir ok

        int[] arr = new int[100];
        for (int j = 0; j < arr.length; j++) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        // 5.uzdevums - palīdzot interneta dzīlēm, arī šķiet, ka viss ir ok

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ievadiet skaitli");
        int c = scanner2.nextInt();
        long factorial = 1;
        for (int d = 1; d <= c; d++) {
            factorial *= d;
        }
        System.out.printf("Faktoriālā vērtība: %d = %d", c, factorial);
        System.out.println();

        // 6.uzdevums - nesanāk ielikt, lai var veikt 3 mēģinājumus

        Scanner scanner3 = new Scanner(System.in);
        Random random = new Random();
        int randomPinCode = random.nextInt(9999);

        System.out.println("Ievadiet četrciparu PIN kodu!");
        int answer1 = scanner.nextInt();
        if (answer1 == randomPinCode) {
            System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ!");
        } else if (answer1 != randomPinCode) {
            System.out.println("Nepareizs PIN, mēģiniet vēlreiz!");
        } else if (answer1 != randomPinCode) {
            System.out.println("Nepareizs PIN, mēģiniet vēlreiz!");
        } else if (answer1 != randomPinCode) {
            System.out.println("Nepareizs PIN, mēģiniet vēlreiz!");
        } else {
            System.out.println("Atvainojiet, bet jūs esat bloķēts!");
        }

    }
}






