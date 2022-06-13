package homework.classHomework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Trijstūris trijstūris1 = new Trijstūris();
        System.out.println("Ievadiet malu A");
        trijstūris1.malaA = scanner.nextInt();
        System.out.println("Ievadiet malu B");
        trijstūris1.malaB = scanner.nextInt();
        System.out.println("Ievadiet malu C");
        trijstūris1.malaC = scanner.nextInt();

        System.out.println("Laukums: " + trijstūris1.trijstūralaukums); // nesaprotu, kāpēc rezultāts ir 0.0

        if (trijstūris1.parbaudeVienadmalu(trijstūris1.malaA, trijstūris1.malaB, trijstūris1.malaC)) {
            System.out.println("Trijstūris IR vienādmalu!");
        } else {
            System.out.println("Trijstūris NAV vienādmalu!");
        }

        if (trijstūris1.parbaudeVienadsanu(trijstūris1.malaA, trijstūris1.malaB, trijstūris1.malaC)) {
            System.out.println("Trijstūris IR vienādsānu!");
        } else {
            System.out.println("Trijstūris NAV vienādsānu!");
        }

        Trijstūris trijstūris2 = new Trijstūris();

        trijstūris2.malaA = 3;
        trijstūris2.malaB = 3;
        trijstūris2.malaC = 5;

        System.out.println("Laukums: " + trijstūris2.trijstūralaukums); // nesaprotu, kāpēc rezultāts ir 0.0

        if (trijstūris2.parbaudeVienadmalu(trijstūris2.malaA, trijstūris2.malaB, trijstūris2.malaC)) {
            System.out.println("Trijstūris IR vienādmalu!");
        } else {
            System.out.println("Trijstūris NAV vienādmalu!");
        }

        if (trijstūris2.parbaudeVienadsanu(trijstūris2.malaA, trijstūris2.malaB, trijstūris2.malaC)) {
            System.out.println("Trijstūris IR vienādsānu!");
        } else {
            System.out.println("Trijstūris NAV vienādsānu!");
        }

    }
}



