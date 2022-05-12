package classroom;

public class MyFirstJavaCode {

    public static void main(String[] args) {
        System.out.println("Hello World! My name is Elīna!");
        System.out.println("First argument is: " + args[0]);
        System.out.println("Second argument is: " + args[1]);

        // String[] args = {"Hello", "World"};
        // String[] twoWords = {"Hello", "World"};


        byte floorCount = 9;
        byte [] floors = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("My house consist of " + floorCount + " floors!");
        System.out.printf("My house consist of %d floors! \n", floorCount);
        System.out.printf("My house consist of %d floors! \n", floorCount);

        short juniorTesterSalaryInEur = 1000;
        short salariesInIt[] = {1000, 2000, 3000};
        short emptySalariesArray[] = new short[4];
        emptySalariesArray[0] = 1000;
        emptySalariesArray[1] = 2000;
        emptySalariesArray[2] = 3000;
        emptySalariesArray[3] = 4000;
        System.out.println(emptySalariesArray[2]);

        System.out.println(juniorTesterSalaryInEur);
        System.out.printf("Average salary for Junior QA Engineer is: %d\n", juniorTesterSalaryInEur);

        int chinaPopulation = 1449687399;
        System.out.printf("China Population %d people\n", chinaPopulation);

        long currentWorldPopulation = 79499700;
        System.out.printf("Current World population: %d\n", currentWorldPopulation);

        float myCurrentWeight = 70.6f;
        System.out.println(myCurrentWeight);

        double gasPriceInEur = 1.834d;
        System.out.println(gasPriceInEur);

        boolean isSummer = false;
        if (isSummer) {
            System.out.printf("Now it is summer! And boolean value is: %b\n", isSummer);
        } else {
            System.out.printf("No, summer will be the next! And boolean value is: %b\n", isSummer);
        }

        char firstNameLetter = 'E';
        System.out.println(firstNameLetter);

        String myNameAndSurname = "Elīna Paeglīte";
        System.out.println(myNameAndSurname);

        System.out.println(7 + 7);
        System.out.println("7 + 7");
        System.out.println("7" + 7);
        System.out.println("7" + "7");
        System.out.println(7 + "7");

        int a = 10;
        int b = 5;
        System.out.println(a + b);

        int c = a + b;
        System.out.println(c);

        boolean isAGreaterThanB = a > b;
        System.out.printf("Is a greater than b: %b", isAGreaterThanB);

    }

}
