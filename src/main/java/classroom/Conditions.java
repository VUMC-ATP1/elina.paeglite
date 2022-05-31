package classroom;

public class Conditions {
    public static void main(String[] args) {

        System.out.println("Before condition check");

        if(20 > 18){
            System.out.println("Yes, 20 > 18");
        }

        System.out.println("After condition check");

        int age = 5;

        if(age >= 18){
            System.out.println("You can go vote!");
        } else {
            System.out.println("You can't go vote!");
        }
        System.out.println("Thank you!");

        int currentTime = 19;
        if (currentTime < 18) {
            System.out.println("Good day!");
        } else {
            System.out.println("Good evening!");
        }

        int a = 10;
        int b = 20;
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println(max);

        max = (a > b) ? a : b;
        System.out.println(max);
        System.out.println(Math.max(a, b));

        int number = 5;
        if (number <= 0) {
            System.out.println("Number is less or equals then 0");
        } else if (number > 3) {
            System.out.println("Number is greater then 3");
        } else if (number > 5) {
            System.out.println("Number is greater then 5");
        } else {
            System.out.println(".....");
        }

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not correct day of the week!");
        }
    }
}
